package tasks;

public class MaximizeConfusionExam {
    private static final char TRUE = 'T';
    private static final char FALSE = 'F';

    /**
     * A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false.
     * He wants to confuse the students by maximizing the number of consecutive questions with the same answer
     * (multiple trues or multiple falses in a row).
     * You are given a string answerKey, where answerKey[i] is the original answer to the ith question.
     * In addition, you are given an integer k, the maximum number of times you may perform the following operation:
     * Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
     *
     * @param answerKey -
     * @param k         - the maximum number of times you may perform the following operation
     * @return the maximum number of consecutive 'T's or 'F's
     * in the answer key after performing the operation at most k times.
     */
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return solution(answerKey, k);
    }

    private int solution(String answerKey, final int permutation) {
        int result = 0;
        int freq = 0;
        int left = 0;
        int[] freqM = new int[2];

        for (int i = 0; i < answerKey.length(); i++) {
            char ch = answerKey.charAt(i);
            freqM[index(ch)]++;
            freq = Math.max(freq, freqM[index(ch)]);

            int curRes = i - left + 1 - freq;

            if (curRes > permutation) {
                freqM[index(answerKey.charAt(left))]--;
                left++;
            }

            result = Math.max(result, i - left + 1);
        }

        return result;
    }

    private int index(char ch) {
        if (ch == TRUE) return 0;
        if (ch == FALSE) return 1;

        throw new IllegalArgumentException("Expected: T or F, Got: " + ch);
    }
}
