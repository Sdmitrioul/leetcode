package random;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums).mapToObj(String::valueOf)
                .sorted(LargestNumber::customStringComparator)
                .collect(Collectors.joining());
        if (result.charAt(0) == '0') {
            return "0";
        }
        return result;
    }

    private static int customStringComparator(String first, String second) {
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            char cFirst = first.charAt(i);
            char cSecond = second.charAt(i);
            if (cFirst > cSecond) {
                return -1;
            } else if (cFirst < cSecond) {
                return 1;
            }
        }
        if (first.length() > second.length()) {
            return customStringComparator(first.substring(second.length()), second);
        } else if (second.length() > first.length()) {
            return customStringComparator(first, second.substring(first.length()));
        }
        return 0;
    }
}
