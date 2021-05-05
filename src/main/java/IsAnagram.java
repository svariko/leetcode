package main.java;

public class IsAnagram {

    private static final int LOWERCASE_A_CODEPOINT = 97;

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int[] letterOccurrences = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letterOccurrences[s.codePointAt(i) - LOWERCASE_A_CODEPOINT] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            letterOccurrences[t.codePointAt(i) - LOWERCASE_A_CODEPOINT] -= 1;
        }

        boolean isAnagram = true;

        for (int count: letterOccurrences) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}
