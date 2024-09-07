package random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MostStonesRemovedWithSameRowOrColumn {
    private static final int DIFFERENCE = 10001;
    public int removeStones(int[][] stones) {
        int n = stones.length;
        UnionFind uf = new UnionFind();

        for (int[] stone : stones) {
            uf.union(stone[0], stone[1] + DIFFERENCE);
        }

        return n - uf.componentCount;
    }

    private static final class UnionFind {
        int[] parent;
        int componentCount;
        Set<Integer> uniqueNodes;

        UnionFind() {
            parent = new int[DIFFERENCE * 2];
            Arrays.fill(parent, -1);
            componentCount = 0;
            uniqueNodes = new HashSet<>();
        }

        int find(int node) {
            if (!uniqueNodes.contains(node)) {
                componentCount++;
                uniqueNodes.add(node);
            }

            if (parent[node] == -1) {
                return node;
            }
            return parent[node] = find(parent[node]);
        }

        void union(int node1, int node2) {
            int root1 = find(node1);
            int root2 = find(node2);

            if (root1 == root2) {
                return;
            }

            parent[root1] = root2;
            componentCount--;
        }
    }
}
