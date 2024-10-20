package random;

public class ParsingBooleanExpression {
    public boolean parseBoolExpr(String expression) {
        return evaluate(expression, 0).value;
    }

    private Position evaluate(String expression, int i) {
        char current = expression.charAt(i);
        switch (current) {
            case 't':
                return new Position(true, i + 1);
            case 'f':
                return new Position(false, i + 1);
            case '!':
                Position negate = evaluate(expression, i + 2);
                return new Position(!negate.value, negate.position + 1);
            case '|':
                Position or = evaluate(expression, i + 2);
                while (expression.charAt(or.position()) == ',') {
                    Position tmp = evaluate(expression, or.position + 1);
                    or = new Position(or.value || tmp.value, tmp.position);
                }
                return new Position(or.value, or.position + 1);
            case '&':
                Position and = evaluate(expression, i + 2);
                while (expression.charAt(and.position()) == ',') {
                    Position tmp = evaluate(expression, and.position + 1);
                    and = new Position(and.value && tmp.value, tmp.position);
                }
                return new Position(and.value, and.position + 1);
            default:
                throw new IllegalArgumentException("Unexpected character: " + current);
        }
    }

    private record Position(boolean value, int position) {}
}
