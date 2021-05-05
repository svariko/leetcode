package main.java;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int carry = 1;
        int position = digits.length - 1;

        for (; position >= 0; position--) {
            int value = digits[position] + carry;
            if (value > 9) {
                result[position] = 0;
            }
            else {
                result[position] = value;
                carry = 0;
                position -= 1;
                break;
            }
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) {
                result[j] = 0;
            }
        }
        else {
            for (; position >= 0; position--) {
                result[position] = digits[position];
            }
        }

        return result;

    }
}
