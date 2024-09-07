package random;

import java.util.List;

public class MaximumDistanceInArrays {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxIndex = -1;
        int minIndex = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> list = arrays.get(i);
            int biggest = list.get(list.size() - 1);
            int smallest = list.get(0);

            if (biggest > max) {
                max2 = max;
                max = biggest;
                maxIndex = i;
            } else if (biggest > max2) {
                max2 = biggest;
            }

            if (smallest < min) {
                min2 = min;
                min = smallest;
                minIndex = i;
            } else if (smallest < min2) {
                min2 = smallest;
            }
        }

        if (minIndex != maxIndex) {
            return Math.abs(max - min);
        } else {
            return Math.max(Math.abs(max2 - min), Math.abs(max - min2));
        }
    }
}
