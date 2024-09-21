package algorithms;

public class KMP {
    public static int[] getPrefixTable(String s) {
        int[] prefixTable = new int[s.length() + 1];
        prefixTable[0] = -1;
        for (int i = 1; i <= s.length(); i++) {
            int k = prefixTable[i - 1];
            while (k >= 0 && s.charAt(k) != s.charAt(i - 1)) {
                k = prefixTable[k];
            }
            prefixTable[i] = k + 1;
        }
        return prefixTable;
    }
}
