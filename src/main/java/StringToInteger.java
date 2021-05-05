package main.java;

public class StringToInteger {

    private final int ZERO_CHARACTER_CODEPOINT = 48;
    private final int NINE_CHARACTER_CODEPOINT = 57;

    private boolean isDigitCharacter(int codePoint) {
        return (codePoint >= ZERO_CHARACTER_CODEPOINT &&
                codePoint <= NINE_CHARACTER_CODEPOINT);
    }

    private boolean isWithinIntRange(String digits, boolean isPositive) {
        if (digits.length() > String.valueOf(Integer.MAX_VALUE).length()) {
            return false;
        }
        else if (digits.length() < String.valueOf(Integer.MAX_VALUE).length()) {
            return true;
        }
        else {
            String maxMagnitude;
            if (isPositive) {
                maxMagnitude = String.valueOf(Integer.MAX_VALUE);
            }
            else {
               maxMagnitude = String.valueOf(Integer.MIN_VALUE).substring(1);
            }
            boolean isWithinIntRange = true;
            for (int i = 0; i < digits.length(); i++) {
                if (digits.codePointAt(i) > maxMagnitude.codePointAt(i)) {
                    isWithinIntRange = false;
                    break;
                }
            }
            return isWithinIntRange;
        }
    }

    private int getIntForCodePoint(int codePoint) {
        return (codePoint - ZERO_CHARACTER_CODEPOINT);
    }

    private int getIntFromDigits(String digits) {
        int sum = 0;
        int power = 0;
        for (int i = digits.length() - 1; i >= 0; i--) {
            sum += getIntForCodePoint(digits.codePointAt(i)) * Math.pow(10,power);
            power += 1;
        }
        return sum;
    }

    private int getFirstNonSpaceIndex(String s) {
        int cursor = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                cursor = i;
                break;
            }
        }
        return cursor;
    }

    private int getNonZeroStartIndex(String s, int cursorStart) {
        int nonZeroStart = -1;
        for (int i = cursorStart; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                nonZeroStart = i;
                break;
            }
        }
        return nonZeroStart;
    }


    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int cursor = getFirstNonSpaceIndex(s);
        if (cursor == -1) {
            return 0;
        }

        boolean isPositive = true;
        if (s.charAt(cursor) == '-') {
            isPositive = false;
            cursor += 1;
        }
        else if (s.charAt(cursor) == '+') {
            cursor += 1;
        }

        cursor = getNonZeroStartIndex(s, cursor);
        if (cursor == -1) {
            return 0;
        }



        StringBuilder digits = new StringBuilder();



        for (int i = cursor; i < s.length(); i++) {
            if (isDigitCharacter(s.codePointAt(i))) {
                digits.append(s.charAt(i));
            }
            else {
                break;
            }
        }

        if (digits.length() == 0) {
            return 0;
        }
        String digitString = new String(digits);
        if (isWithinIntRange(digitString, isPositive)) {
            int magnitude = getIntFromDigits(digitString);
            if (isPositive) {
                return magnitude;
            }
            else {
                return -1 * magnitude;
            }
        }
        else {
            if (isPositive) {
                return Integer.MAX_VALUE;
            }
            else {
                return Integer.MIN_VALUE;
            }
        }
    }
}
