package random;

import java.util.List;

public class MinimumTimeDifference {
    private static final int ONE_DAY_IN_MINUTES = 24 * 60;

    public int findMinDifference(List<String> timePoints) {
        List<Integer> times = timePoints.stream().map(MinimumTimeDifference::getTimeInMinutes).sorted().toList();
        int minimumDifference = Integer.MAX_VALUE;
        for (int i = 0; i < times.size() + 1; i++) {
            minimumDifference = Math.min(minimumDifference, getTimeDifference(times.get(i % times.size()), times.get((i + 1) % times.size())));
        }
        return minimumDifference;
    }

    private static int getTimeDifference(int one, int two) {
        int minTime = Math.min(one, two);
        int maxTime = Math.max(one, two);
        return Math.min(maxTime - minTime, Math.abs(minTime + ONE_DAY_IN_MINUTES - maxTime) % ONE_DAY_IN_MINUTES);
    }

    private static int getTimeInMinutes(String time) {
        int hours = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int minutes = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
        return hours * 60 + minutes;
    }
}
