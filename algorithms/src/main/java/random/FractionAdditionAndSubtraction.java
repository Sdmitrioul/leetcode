package random;

import java.util.List;

public class FractionAdditionAndSubtraction {
    private static final List<Integer> PRIMES = List.of(2, 3, 5, 7);
    public String fractionAddition(String expression) {
        int index = 0;

        Fraction left = new Fraction(0, 1);
        Fraction right = new Fraction(0, 1);
        while (index < expression.length()) {
            char c = expression.charAt(index++);
            if (c == '-') {

            }

        }
        return "";
    }

    public int parseInt(char c) {
        switch (c) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return -1;
        }
    }

    private static final class Fraction {
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        void operate(Fraction other, char operation) {
            if (other.denominator != this.denominator) {
                int left = this.denominator;
                int right = other.denominator;
                other.numerator *= left;
                this.numerator *= right;
                this.denominator *= right;
            }
            if (operation == '+') {
                this.numerator += other.numerator;
            } else if (operation == '-') {
                this.numerator -= other.numerator;
            } else {
                throw new UnsupportedOperationException("Unsupported operation: " + operation);
            }
            other.denominator = 1;
            other.numerator *= 0;
            for (int prime : PRIMES) {
                while (true) {
                    if (this.numerator % prime == 0 && this.denominator % prime == 0) {
                        this.numerator /= prime;
                        this.denominator /= prime;
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
