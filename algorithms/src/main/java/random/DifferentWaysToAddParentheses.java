package random;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Character> operators = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                operators.add(c);
            }
            if (Character.isDigit(c)) {
                int value = c - '0';
                char nextChar = expression.charAt(i + 1);
                if (Character.isDigit(nextChar)) {
                    value *= 10;
                    value += nextChar - '0';
                    i++;
                }
                values.add(value);
            }
        }

        return List.of();
    }
}
