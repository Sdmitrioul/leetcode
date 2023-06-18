package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PartitionArrayByPivotTests {
    private final PartitionArrayByPivot tested = new PartitionArrayByPivot();

    @Test
    void basicTests() {
        int[] result = tested.pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10);

        assertArrayEquals(new int[]{9, 5, 3, 10, 10, 12, 14}, result);

        result = tested.pivotArray(new int[]{-3, 4, 3, 2}, 2);

        assertArrayEquals(new int[]{-3, 2, 4, 3}, result);

        result = tested.pivotArray(new int[]{19, 15, 12, -14, 8, -7, -11}, -7);

        assertArrayEquals(new int[]{-14, -11, -7, 19, 15, 12, 8}, result);
    }

    /*private int[] testResult(int[] nums, int pivot) {
        List<Integer> less = new LinkedList<>();
        List<Integer> bigger = new LinkedList<>();

        Arrays.stream(nums).forEach(value -> {
            if (value < pivot) {
                less.add(value);
            } else if (value > pivot) {
                bigger.add(value);
            }
        });

        final int countEquals = (int) Arrays.stream(nums).filter(it -> it == pivot).count();

        List<Integer> result = new ArrayList<>(less);
        for (int i = 0; i < countEquals; i++) {
            result.add(pivot);
        }
        result.addAll(bigger);

        int[] res = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }*/
}
