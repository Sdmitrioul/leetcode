package random;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] characters = new boolean[26];
        for (char c : allowed.toCharArray()) {
            characters[c - 'a'] = true;
        }
        int counter = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!characters[word.charAt(i) - 'a']) {
                    break;
                }
                if (i == word.length() - 1) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
