package random;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int counter = 0;
        int closed = 0;
        for (char current : s.toCharArray()) {
            if (current == ')' && closed == 0) {
                counter++;
            } else if (current == ')') {
                closed--;
            } else if (current == '(') {
                closed++;
            }
        }
        return counter + closed;
    }
}
