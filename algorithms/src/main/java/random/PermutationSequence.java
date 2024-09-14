
package random;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        k -= 1;
        int max = 1;
        boolean[] used = new boolean[n];
        for (int i = 1; i < n; i++) {
            max *= i;
        }
        StringBuilder sb = new StringBuilder();
        if (k == 0) {
            while (sb.length() < n) {
                int index = 0;
                while (used[index]) {
                    index++;
                }
                sb.append(index + 1);
                used[index] = true;
            }
            return sb.toString();
        }
        for (int i = 1; i <= n; i++) {
            if (k + 1 == max) {
                sb.append(getValue(0, used));
                while (sb.length() < n) {
                    int index = n - 1;
                    while (used[index]) {
                        index--;
                    }
                    sb.append(index + 1);
                    used[index] = true;
                }
                return sb.toString();
            } else if (k == 0) {
                while (sb.length() < n) {
                    int index = 0;
                    while (used[index]) {
                        index++;
                    }
                    sb.append(index + 1);
                    used[index] = true;
                }
                return sb.toString();
            }
            int del = k / max;
            sb.append(getValue(del, used));
            k %= max;
            max /= Math.max(n - i, 1);
        }
        return sb.toString();
    }

    private int getValue(int del, boolean[] used) {
        int index = 0;
        while (index < used.length) {
            if (used[index]) {
                index++;
                continue;
            }
            if (del == 0) {
                used[index] = true;
                return index + 1;
            }
            index++;
            del--;
        }
        return index;
    }
}
