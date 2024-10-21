package random;

import java.util.HashSet;
import java.util.Set;

public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
    public int maxUniqueSplit(String s) {
        int[] max = new int[]{0};
        trySplit(s, 0, max, new HashSet<>());
        return max[0];
    }

    public void trySplit(String source, int position, int[] max, Set<Integer> visited) {
        if (source.length() - position + visited.size() < max.length) {
            return;
        }
        if (position >= source.length()) {
            max[0] = Math.max(max[0], visited.size());
            return;
        }
        if (position == source.length() - 1) {
            int hash = hash(source, position, source.length());
            if (visited.add(hash)) {
                max[0] = Math.max(max[0], visited.size());
                visited.remove(hash);
                return;
            }
            return;
        }
        for (int i = position; i < source.length(); i++) {
            int hash = hash(source, position, i + 1);
            if (!visited.add(hash)) {
                continue;
            }
            trySplit(source, i + 1, max, visited);
            max[0] = Math.max(max[0], visited.size());
            visited.remove(hash);
        }
    }

    public int hash(String source, int from, int to) {
        int result = 0;
        for (int i = from; i < to; i++) {
            result = result * 31 + source.charAt(i);
        }
        return result;
    }
}
