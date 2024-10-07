package random;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumStringLengthAfterRemovingSubstrings {
    //"AB" or "CD"
    public int minLength(String s) {
        int counter = s.length();
        Deque<Character> stack = new ArrayDeque<>();
        for (char character : s.toCharArray()) {
            char waitedPrev = character == 'B' ? 'A' : (character == 'D' ? 'C' : 0);
            if (stack.isEmpty() || waitedPrev != stack.peek()) {
                stack.push(character);
            } else {
                stack.poll();
                counter -= 2;
            }
        }
        return counter;
    }
}
