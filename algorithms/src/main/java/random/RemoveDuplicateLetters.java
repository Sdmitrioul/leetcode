package random;

import java.util.*;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for (int i = 0; i < s.length(); i++) {
             lastOccurrence[s.charAt(i) - 'a'] = i;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i) - 'a';
            if (visited[current]) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > current && lastOccurrence[stack.peek()] > i) {
                visited[stack.pop()] = false;
            }
            visited[current] = true;
            stack.push(current);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append((char) (stack.pop() + 'a'));
        }
        return sb.reverse().toString();
    }
}
