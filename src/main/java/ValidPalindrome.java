package main.java;

public class ValidPalindrome {

    private boolean isAlphaNumeric(int codePoint) {
        if (codePoint >= 48 && codePoint <= 57) {
            return true;
        } else if (codePoint >= 65 && codePoint <= 90) {
            return true;
        } else if (codePoint >= 97 && codePoint <= 122) {
            return true;
        } else {
            return false;
        }


    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isAlphaNumeric(s.codePointAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        String alphaNumeric = new String(stringBuilder);
        String valid = alphaNumeric.toLowerCase();

        int left = 0;
        int right = valid.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (valid.charAt(left) != valid.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left += 1;
            right -= 1;
        }
        return isPalindrome;

    }
}
