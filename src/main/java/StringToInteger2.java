package main.java;



public class StringToInteger2 {

    private final int ZERO_CHARACTER_CODEPOINT = 48;
    private final int NINE_CHARACTER_CODEPOINT = 57;

    public int getNonZeroStartIndex(String digits) {
        int nonZeroStart = -1;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) != '0') {
                nonZeroStart = i;
                break;
            }
        }
        return nonZeroStart;
    }

    public int getNonSpaceStartIndex(String s) {
        int nonSpaceStart = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                nonSpaceStart = i;
                break;
            }
        }
        return nonSpaceStart;
    }

    public int getClampedValue(boolean isPositive) {
        if (isPositive) {
            return Integer.MAX_VALUE;
        }
        else {
            return Integer.MIN_VALUE;
        }
    }

    public String getMinIntegerDigits() {
        return String.valueOf(Integer.MIN_VALUE).substring(1);
    }

    public int getIntFromDigits(String digits, boolean isPositive) {
        int magnitude = 0;
        int exponent = 0;

        // if input string is the characters of Integer.MIN_VALUE,
        // the magnitude cannot be computed through the sum loop below due to overflow,
        // so check for Integer.MIN_VALUE digits explicitly and return Integer.MIN_VALUE
        if (digits.equals(getMinIntegerDigits()) && !isPositive) {
            return Integer.MIN_VALUE;
        }

        for (int i = digits.length() - 1; i >= 0; i--) {
            magnitude += (digits.codePointAt(i) - ZERO_CHARACTER_CODEPOINT) * Math.pow(10, exponent);
            exponent += 1;
        }
        if (isPositive) {
            return magnitude;
        }
        else {
            return (-1 * magnitude);
        }
    }

    public boolean isWithinIntRange(String digits, boolean isPositive) {
        String limit;
        if (isPositive) {
            limit = String.valueOf(Integer.MAX_VALUE);
        }
        else {
            limit = String.valueOf(Integer.MIN_VALUE).substring(1);
        }

        if (digits.length() < limit.length()) {
            return true;
        }
        else if (digits.length() > limit.length()) {
            return false;
        }
        else {
            boolean isWithin = true;
            for (int i = 0; i < digits.length(); i++) {
                if (digits.codePointAt(i) > limit.codePointAt(i)) {
                    isWithin = false;
                    break;
                }
                if (digits.codePointAt(i) < limit.codePointAt(i)) {
                    break;
                }
            }
            return isWithin;
        }
    }



    public boolean isDigitCodepoint(int codePoint) {
        return (codePoint >= ZERO_CHARACTER_CODEPOINT &&
                codePoint <= NINE_CHARACTER_CODEPOINT);
    }

    public int myAtoi(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int cursor = getNonSpaceStartIndex(s);
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

        StringBuilder digitsRead = new StringBuilder();
        for (int i = cursor; i < s.length(); i++) {
            if (isDigitCodepoint(s.codePointAt(i))) {
                digitsRead.append(s.charAt(i));
            }
            else {
                break;
            }
        }
        if (digitsRead.length() == 0) {
            return 0;
        }

        String digits = new String(digitsRead);
        cursor = getNonZeroStartIndex(digits);
        if (cursor == -1) {
            return 0;
        }
        String zeroStrippedDigits = digits.substring(cursor);

        if (isWithinIntRange(zeroStrippedDigits, isPositive)) {
            return getIntFromDigits(zeroStrippedDigits, isPositive);
        }
        else {
            return getClampedValue(isPositive);
        }
    }
}
