package tasks;

public class LargestPalindromicNumber {
    /**
     * You are given a string num consisting of digits only.
     * [1] Return the largest palindromic integer (in the form of a string) that can be formed using digits taken from num.
     * It should not contain leading zeroes.
     * Notes:
     * You do not need to use all the digits of num, but you must use at least one digit.
     * The digits can be reordered.
     * @param num - array consisting of digits only.
     * @return - [1]
     */
    public String largestPalindromic(String num) {
        int[] counts = new int[10];

        for (char c : num.toCharArray()) {
            counts[c - '0']++;
        }

        StringBuilder prefix = new StringBuilder();

        for (int i = 9; i > -1; i--) {
            if (i != 0 || !prefix.isEmpty()) {
                while (counts[i] > 1) {
                    prefix.append(i);
                    counts[i] -= 2;
                }
            }
        }

        String middle = "";

        for (int i = 9; i > -1 ; i--) {
            if (counts[i] > 0) {
                middle = String.valueOf(i);
                break;
            }
        }

        String prefixValue = prefix.toString();

        return prefixValue + middle  + prefix.reverse();
    }
}
