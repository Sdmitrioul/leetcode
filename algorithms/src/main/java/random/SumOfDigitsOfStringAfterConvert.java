package random;

public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        k--;
        int sum = 0;
        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;
            sum += sumOfDigits(value);
        }

        while (k-- > 0) {
            sum = sumOfDigits(sum);
        }

        return sum;
    }

    private static int sumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
