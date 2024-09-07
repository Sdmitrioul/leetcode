package random;

public class MaxChunksToMakeSorted2 {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] minOfRight = new int[n];
        minOfRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minOfRight[i] = Math.min(minOfRight[i + 1], arr[i]);
        }
        int res = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max,arr[i]);
            if (max <= minOfRight[i + 1]) res++;
        }
        return res + 1;
    }

    /*public int maxChunksToSorted(int[] arr) {
        int[] sorted = new int[arr.length];
        System.arraycopy(arr, 0, sorted, 0, arr.length);
        Arrays.sort(sorted);
        int chunks = 0;
        Map<Integer, Integer> sortedElements = new HashMap<>();
        Map<Integer, Integer> unsortedElements = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            int sort = sorted[i];
            int unsort = arr[i];
            if (sort == unsort && sortedElements.isEmpty() && unsortedElements.isEmpty()) {
                chunks++;
                continue;
            }
            if (sort == unsort) {
                continue;
            }
            boolean rUnsorted = unsortedElements.containsKey(sort);
            boolean rSorted = sortedElements.containsKey(unsort);
            if (!rUnsorted) {
                sortedElements.compute(sort, (k, v) -> v == null ? 1 : v + 1);
            } else {
                unsortedElements.compute(sort, (k, v) -> v == null ? null : (v - 1 == 0 ? null : v - 1));
            }
            if (!rSorted) {
                unsortedElements.compute(unsort, (k, v) -> v == null ? 1 : v + 1);
            }else {
                sortedElements.compute(unsort, (k, v) -> v == null ? null : (v - 1 == 0 ? null : v - 1));
            }
            if (sortedElements.isEmpty() && unsortedElements.isEmpty()) {
                chunks++;
            }
        }
        return chunks;
    }*/
}
