package random;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        var input = Arrays.stream(candidates)
                .filter(element -> element <= target)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        for (int i = 1; i <= Math.pow(2, input.size()); i++) {
            List<Integer> res = new LinkedList<>();
            int sum = 0;
            for (int j = 0; j < input.size(); j++) {
                if (((i >>> j) & 1) != 0) {
                    res.add(candidates[j]);
                    sum += candidates[j];
                }
            }
            if (sum == target) {
                result.add(res);
            }
        }
        return result;
    }
}
