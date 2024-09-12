package random;

public class MinimumBitFlipsToConvertNumber {
    public int minBitFlips(int start, int goal) {
       /* String longest = Integer.toBinaryString(Math.max(start, goal));
        String shortest = Integer.toBinaryString(Math.min(start, goal));
        int size = Math.min(longest.length(), shortest.length());
        int result = 0;
        for (int i = 0; i < size; i++) {
            char gc = shortest.charAt(shortest.length() - 1 - i);
            char sc = longest.charAt(longest.length() - 1 - i);
            if (gc != sc) {
                result++;
            }
        }
        for (int i = 0; i < longest.length() - size; i++) {
            result += longest.charAt(i) == '1' ? 1 : 0;
        }
        return result;*/
        int xorResult = start ^ goal;
        int count = 0;
        while (xorResult != 0) {
            xorResult &= (xorResult - 1);
            count++;
        }
        return count;
    }
}
