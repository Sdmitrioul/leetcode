package random;

public class FindKthBitInNthBinaryString {
    public char findKthBit(int n, int k) {
        if (k == 1) {
            return '0';
        }
        int currentSize = 1;
        int currentIndex = 1;
        StringBuilder sb = new StringBuilder();
        sb.append('0');
        while (currentSize <= n) {
            sb.append('1');
            currentIndex++;
            if (currentIndex == k) {
                return '1';
            }
            int size = sb.length();
            for (int i = 0; i < size - 1; i++) {
                char reversed = sb.charAt(size - 2 - i) == '0' ? '1' : '0';
                sb.append(reversed);
                currentIndex++;
                if (currentIndex == k) {
                    return reversed;
                }
            }
            currentSize++;
        }
        return '0';
    }
}
