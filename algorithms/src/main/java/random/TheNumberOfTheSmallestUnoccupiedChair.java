package random;

import java.util.*;
import java.util.stream.IntStream;

public class TheNumberOfTheSmallestUnoccupiedChair {
    public int smallestChair(int[][] times, int targetFriend) {
        List<Friend> friends = new ArrayList<>();

        for (int i = 0; i < times.length; i++) {
            friends.add(new Friend(i, times[i][0], times[i][1]));
        }

        friends.sort(Comparator.comparingInt(f -> f.arrival));
        Map<Integer, Integer> personToChair = new HashMap<>();
        Queue<Integer> emptyChairs = new PriorityQueue<>();
        IntStream.rangeClosed(0, times.length).forEach(emptyChairs::offer);
        Queue<Friend> friendsOnParty = new PriorityQueue<>(Comparator.comparingInt(f -> f.leaving));

        for (Friend friend : friends) {
            int time = friend.arrival;
            while (!friendsOnParty.isEmpty() && friendsOnParty.peek().leaving <= time) {
                emptyChairs.offer(personToChair.remove(friendsOnParty.poll().index));
            }
            int chair = emptyChairs.poll();
            if (friend.index == targetFriend) {
                return chair;
            }
            personToChair.put(friend.index, chair);
            friendsOnParty.offer(friend);
        }
        return targetFriend;
    }

    private static class Friend {
        final int index;
        final int arrival;
        final int leaving;

        public Friend(int index, int arrival, int leaving) {
            this.index = index;
            this.arrival = arrival;
            this.leaving = leaving;
        }
    }
}
