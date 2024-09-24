package random;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> result = new ArrayList<>(n);

        int current = 1;

        for (int i = 1; i <= n; i++) {
            result.add(current);

            if (current * 10 <= n) {
                current *= 10;
            } else {
                while (current % 10 == 9 || current >= n) {
                    current /= 10;
                }
                current += 1;
            }
        }
        return result;
    }
}
