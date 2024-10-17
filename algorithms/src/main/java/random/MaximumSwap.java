package random;

public class MaximumSwap {
    public int maximumSwap(int num) {
        int[] value = new int[10];
        int index = 0;
        int number = num;
        while (number != 0) {
            int currentDigit = number % 10;
            value[index++] = currentDigit;
            number /= 10;
        }
        int maxIndex = -1;
        int changeFirst = -1;
        int changeSecond = -1;
        for (int i = 0; i < index; i++) {
            if (maxIndex == -1 || value[i] > value[maxIndex]) {
                maxIndex = i;
            } else if (value[i] < value[maxIndex]) {
                changeFirst = i;
                changeSecond = maxIndex;
            }
        }
        if (changeFirst == -1) {
            return num;
        }
        int result = 0;
        for (int i = index - 1; i >= 0; i--) {
            if (i == changeSecond) {
                result = result * 10 + value[changeFirst];
            } else if (i == changeFirst) {
                result = result * 10 + value[changeSecond];
            } else {
                result = result * 10 + value[i];
            }
        }
        return result;
    }
}
