package random;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        int swaps = 0;
        int open = 0;
        int close = 0;
        int lastOpen = s.length() - 1;
        while (s.charAt(lastOpen) != '[') {
            lastOpen--;
        }
        for (int i = 0; i < lastOpen; i++) {
            if (s.charAt(i) == '[') {
                open++;
            } else if (s.charAt(i) == ']') {
                if (open <= close) {
                    swaps++;
                    open++;
                    while (s.charAt(lastOpen) != '[') {
                        lastOpen--;
                    }
                } else {
                    close++;
                }
            }
        }
        return swaps;
    }
}
