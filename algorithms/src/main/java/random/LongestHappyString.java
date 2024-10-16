package random;

public class LongestHappyString {
    private static final char A = 'a';
    private static final char B = 'b';
    private static final char C = 'c';

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        char previous = 0;
        char prePrevious = 0;
        while (a != 0 || b != 0 || c != 0) {
            char append = 0;
            if (a >= b && a >= c) {
                if (previous != A || prePrevious != A) {
                    append = A;
                } else if (b > 0 || c > 0) {
                    append = b > c ? B : C;
                }
            } else if (b >= a && b >= c) {
                if (previous != B || prePrevious != B) {
                    append = B;
                } else if (a > 0 || c > 0) {
                    append = c > a ? C : A;
                }
            } else if (c >= b && c >= a) {
                if (previous != C || prePrevious != C) {
                    append = C;
                } else if (b > 0 || a > 0) {
                    append = b > a ? B : A;
                }
            }
            if (append == 0) {
                break;
            }
            sb.append(append);
            prePrevious = previous;
            previous = append;
            if (append == A) {
                a--;
            } else if (append == B) {
                b--;
            } else {
                c--;
            }
        }
        return sb.toString();
    }
}
