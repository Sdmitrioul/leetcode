package random;

import algorithms.KMP;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        String combined = s + "$" + new StringBuilder(s).reverse();
        int[] prefixTable = KMP.getPrefixTable(combined);
        int lengthOfSuffixPalindrom = prefixTable[combined.length()];
        return new StringBuilder(s.substring(lengthOfSuffixPalindrom)).reverse() + s;
    }
}
