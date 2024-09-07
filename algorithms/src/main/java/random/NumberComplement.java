package random;

public class NumberComplement {
    public int findComplement(int num) {
        return (1 << (log2(num) + 1)) - 1 - num;
    }

    public static int log2(int n){
        if(n <= 0) throw new IllegalArgumentException();
        return 31 - Integer.numberOfLeadingZeros(n);
    }
}
