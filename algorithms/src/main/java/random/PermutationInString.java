package random;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (char c : s1.toCharArray()) {
            frequency[c - 'a']++;
        }
        int[] current = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            current[s2.charAt(i) - 'a']++;
        }
        int index = s1.length();
        while (index < s2.length()) {
            if (compareArrays(current, frequency)) {
                return true;
            }
            current[s2.charAt(index) - 'a']++;
            current[s2.charAt(index - s1.length()) - 'a']--;
            index++;
        }
        return compareArrays(current, frequency);
    }

    private static boolean compareArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
