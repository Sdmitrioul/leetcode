package tasks;

import java.util.*;

public class PathMaximumProbability {
    /**
     * You are given an undirected weighted graph of n nodes (0-indexed),
     * represented by an edge list where edges[i] = [a, b] is an undirected edge connecting
     * the nodes a and b with a probability of success of traversing that edge succProb[i].
     * Given two nodes start and end,
     * find the path with the maximum probability of success to go from start to end and return its success probability.
     * If there is no path from start to end, return 0.
     * Your answer will be accepted if it differs from the correct answer by at most 1e-5.
     *
     * @param n        -
     * @param edges    -
     * @param succProb -
     * @param start    -
     * @param end      -
     * @return -
     */
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, List<Edge>> graph = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            double succ = succProb[i];

            graph.computeIfAbsent(edge[0], o -> new ArrayList<>()).add(new Edge(edge[1], succ));
            graph.computeIfAbsent(edge[1], o -> new ArrayList<>()).add(new Edge(edge[0], succ));
        }

        double[] results = new double[n];
        Arrays.fill(results, 0.);

        results[start] = 1.;
        Deque<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.pollFirst();

            List<Edge> currEdges = graph.get(vertex);

            if (currEdges == null) continue;

            for (Edge edge : currEdges) {
                double prob = results[vertex] * edge.probability;

                if (prob > results[edge.target]) {
                    results[edge.target] = prob;
                    queue.add(edge.target);
                }
            }
        }

        return results[end];
    }

    private record Edge(int target, double probability) {
    }
}
