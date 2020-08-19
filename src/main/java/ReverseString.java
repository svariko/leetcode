package main.java;

public class ReverseString {

    public void switchElements(char[] input, int firstIndex, int secondIndex) {
        char temp;

        temp = input[firstIndex];

        input[firstIndex] = input[secondIndex];
        input[secondIndex] = temp;
    }

    public void reverseString(char[] s) {

        int leftIndex = 0;
        int rightIndex = s.length - 1;

        while (leftIndex < rightIndex) {
            switchElements(s, leftIndex, rightIndex);
            leftIndex += 1;
            rightIndex -= 1;
        }
    }
}
