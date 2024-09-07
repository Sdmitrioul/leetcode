package random;

public class FindTheStudentThatWillReplaceTheChalk {
    public int chalkReplacer(int[] chalk, int k) {
        long[] arr = new long[chalk.length];

        for (int i = 0; i < chalk.length; i++) {
            arr[i] = chalk[i] + arr[Math.max(0, i - 1)];
        }

        if (arr[chalk.length - 1] <= k) {
            k %= arr[chalk.length - 1];
        }

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                return k;
            }
            if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
    public int chalkReplacer2(int[] chalk, int k) {
        long[] arr = new long[chalk.length];

        for (int i = 0; i < chalk.length; i++) {
            arr[i] = chalk[i] + arr[Math.max(0, i - 1)];
        }

        if (arr[chalk.length - 1] <= k) {
            k %= arr[chalk.length - 1];
        }

        for (int i = 0; i < chalk.length; i++) {
            if (arr[i] > k) {
                return i;
            }
        }
        return chalk.length - 1;
    }


}
