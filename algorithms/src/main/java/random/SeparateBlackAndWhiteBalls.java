package random;

public class SeparateBlackAndWhiteBalls {
    public long minimumSteps(String s) {
        long counter = 0;
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            } else {
                counter += zeros;
            }
        }
        return counter;
    }
}
