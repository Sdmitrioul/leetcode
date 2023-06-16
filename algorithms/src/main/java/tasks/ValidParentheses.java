package tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidParentheses {
    private final static Map<Character, Character>
            PARENTHESES_MAP = Map.of(')', '(', ']', '[', '}', '{');
    private final static Set<Character> SUPPORTED_PARENTHESES = PARENTHESES_MAP.entrySet()
            .stream()
            .flatMap(pair -> Stream.of(pair.getValue(), pair.getKey()))
            .collect(Collectors.toSet());

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     */
    public boolean isValid(final String input) {
        final Deque<Character> stack = new LinkedList<>();

        for (char element: input.toCharArray()) {
            if (!SUPPORTED_PARENTHESES.contains(element)) {
                throw new InputMismatchException("Unsupported parentheses: " + element);
            }

            Character pairParenthesis = PARENTHESES_MAP.get(element);

            if (pairParenthesis == null) {
                stack.add(element);
                continue;
            }

            if (stack.pollLast() != pairParenthesis) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
