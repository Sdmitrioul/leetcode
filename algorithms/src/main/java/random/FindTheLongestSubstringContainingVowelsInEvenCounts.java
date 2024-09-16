package random;

public class FindTheLongestSubstringContainingVowelsInEvenCounts {
    public int findTheLongestSubstring(String s) {
        int prefixXOR = 0;
        int[] characterMap = new int[26];
        characterMap[0] = 1;
        characterMap['e' - 'a'] = 2;
        characterMap['i' - 'a'] = 4;
        characterMap['o' - 'a'] = 8;
        characterMap['u' - 'a'] = 16;
        int[] dp = new int[32];
        for (int i = 0; i < 32; i++) dp[i] = -1;
        int longestSubstring = 0;
        for (int i = 0; i < s.length(); i++) {
            prefixXOR ^= characterMap[s.charAt(i) - 'a'];
            if (dp[prefixXOR] == -1 && prefixXOR != 0) {
                dp[prefixXOR] = i;
            }
            longestSubstring = Math.max(longestSubstring, i - dp[prefixXOR]);
        }
        return longestSubstring;
    }
}
