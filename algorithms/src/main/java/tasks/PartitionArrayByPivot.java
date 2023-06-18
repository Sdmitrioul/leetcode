package tasks;

public class PartitionArrayByPivot {
    /**
     * You are given a 0-indexed integer array nums and an integer pivot.
     * Rearrange nums such that the following conditions are satisfied:
     * Every element less than pivot appears before every element greater than pivot.
     * Every element equal to pivot appears in between the elements less than and greater than pivot.
     * The relative order of the elements less than pivot and the elements greater than pivot is maintained.
     * More formally, consider every pi, pj where pi is the new position
     * of the ith element and pj is the new position of the jth element.
     * For elements less than pivot, if i < j and nums[i] < pivot and nums[j] < pivot, then pi < pj.
     * Similarly for elements greater than pivot, if i < j and nums[i] > pivot and nums[j] > pivot, then pi < pj.
     * @param nums  - int array to pivot.
     * @param pivot - int.
     * @return - Return nums after the rearrangement.
     */
    public int[] pivotArray(int[] nums, int pivot) {
        return simplePivot(nums, pivot);
    }

    private int[] simplePivot(int[] nums, int pivot) {
        final int[] result = new int[nums.length];
        int lessIndex = 0;
        int biggerIndex = nums.length;

        for (int element : nums) {
            if (element < pivot) {
                result[lessIndex++] = element;
            } else if (element > pivot) {
                result[--biggerIndex] = element;
            }
        }

        for (int i = lessIndex; i < biggerIndex; i++) {
            result[i] = pivot;
        }

        for (int i = 0; i < (nums.length - biggerIndex) / 2; i++) {
            int tmp = result[biggerIndex + i];
            result[biggerIndex + i] = result[nums.length - 1 - i];
            result[nums.length - 1 - i] = tmp;
        }

        return result;
    }
}
