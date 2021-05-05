package main.java;

import java.util.*;

public class FirstUniqueCharacterInString {

    private static final int LOWERCASE_A_CODEPOINT = 97;

    private int getLetterIndex(int codePoint) {
        return codePoint - LOWERCASE_A_CODEPOINT;

    }
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        int[] letterOccurrences = new int[26];


        for (int i = 0; i < s.length(); i++) {
            letterOccurrences[getLetterIndex(s.codePointAt(i))] += 1;
        }

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (letterOccurrences[getLetterIndex(s.codePointAt(i))] == 1) {
                index = i;
                break;
            }
        }
        return index;

    }
}
