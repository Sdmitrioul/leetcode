package random;

import java.util.HashSet;
import java.util.Set;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> visited = new HashSet<>();
        Set<String> rareWords = new HashSet<>();
        StringBuilder word = new StringBuilder();
        String hole = s1 + " " + s2;
        for (int i = 0; i < hole.length(); i++) {
            char currentChar = hole.charAt(i);
            if (currentChar != ' ') {
                word.append(currentChar);
            }
            if (currentChar == ' ' || i == hole.length() - 1) {
                if (!word.isEmpty()) {
                    String wordCurrent = word.toString();
                    word.setLength(0);
                    boolean isAdded = visited.add(wordCurrent);
                    if (isAdded) {
                        rareWords.add(wordCurrent);
                    } else {
                        rareWords.remove(wordCurrent);
                    }
                }
            }
        }
        return rareWords.toArray(new String[0]);
    }
}
