package random;

import java.util.*;

public class ModifyGraphEdgeWeights {
    private static final int MAX = 2_000_000_000;
    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
        List<List<int[]>> graph = new ArrayList<>(n);
        int[] calculatedPath = new int[n];
        List<Set<int[]>> addedEdges = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            addedEdges.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(edge);
            graph.get(to).add(edge);
        }

        Deque<Integer> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int[] edge : graph.get(node)) {
                int weight = edge[2];
                int to = edge[0] == node ? edge[1] : edge[0];

                if (calculatedPath[to] == 0 ||
                        (weight != 0 && calculatedPath[node] + weight < calculatedPath[to]) ||
                        (weight == -1 && calculatedPath[node] + 1 < calculatedPath[to])) {}
            }
        }

        return new int[][]{};
    }
}
