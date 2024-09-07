package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumPushes {
    public static int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        int sum = 0;
        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<Character, Integer> entry = entries.get(entries.size() - i - 1);
            sum += entry.getValue() * (i / 8 + 1);
        }

        return sum;
    }
}
