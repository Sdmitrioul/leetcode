package random;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> rank = new HashMap<>();
        IntStream.of(arr).distinct().sorted().reduce(1, (a, b) -> {
            rank.put(b, a++);
            return a;
        });
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rank.getOrDefault(arr[i], 0);
        }
        return result;
    }
}
