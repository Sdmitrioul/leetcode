package random;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PathWithMaximumProbability {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Edge>> nodes = new ArrayList<>(n);
        double[] result = new double[n];
        result[start_node] = 1;
        for (int i = 0; i < n; i++) {
            nodes.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            Edge edge = new Edge(from, to, succProb[i]);
            nodes.get(from).add(edge);
            nodes.get(to).add(edge);
        }

        Deque<Integer> queue = new LinkedList<>();
        queue.add(start_node);
        while (!queue.isEmpty()) {
            int from = queue.poll();
            List<Edge> neighbors = nodes.get(from);
            for (Edge edge : neighbors) {
                int to = edge.getAnother(from);
                double newProb = result[from] * edge.probability;
                if (result[to] < newProb) {
                    result[to] = newProb;
                    queue.add(to);
                }
            }
        }

        return result[end_node];
    }

    private static final class Edge {
        final int first;
        final int second;
        final double probability;

        Edge(int first, int second, double probability) {
            this.first = first;
            this.second = second;
            this.probability = probability;
        }

        int getAnother(int value) {
            return first == value ? second : first;
        }
    }
}
