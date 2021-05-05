package main.java;

public class ReverseInteger {

    public int reverseInteger(int integer) {


        long absoluteInteger = Math.abs((long) integer);
        boolean isNegative = integer < 0;
        String digits = String.valueOf(absoluteInteger);
        String directReverse = reverseString(digits);

        int nonZeroStart = getNonZeroStartIndex(directReverse);
        if (nonZeroStart == -1) {
            return 0;
        }

        String validReverse = directReverse.substring(nonZeroStart);
        if (isRepresentableByInt(validReverse, isNegative)) {
            if (isNegative) {
                return -1 * Integer.parseInt(validReverse);
            }
            else {
                return Integer.parseInt(validReverse);
            }
        }
        else {
            return 0;
        }

    }

    private boolean isRepresentableByInt(String digits, boolean isNegative) {
        long value = Long.parseLong(digits);


        if (isNegative) {
            return value <= Math.abs((long) Integer.MIN_VALUE);
        }
        else {
            return value <= Integer.MAX_VALUE - 1;
        }
    }



    private String reverseString(String string) {
        if (string == null || string.length() == 0) {
            return string;
        }
        char[] reverseDigits = new char[string.length()];
        for (int i = 0; i < reverseDigits.length; i++) {
            reverseDigits[i] = string.charAt(string.length() - 1 - i);
        }
        return String.valueOf(reverseDigits);

    }


    private int getNonZeroStartIndex(String digits) {
        int nonZeroStart = -1;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) != '0' || digits.charAt(i) != '-') {
                nonZeroStart = i;
                break;
            }
        }
        return nonZeroStart;
    }
}
