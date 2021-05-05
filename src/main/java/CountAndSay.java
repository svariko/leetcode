package main.java;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String previous = countAndSay(n - 1);
        char currentDigit = previous.charAt(0);
        int count = 1;
        StringBuilder string = new StringBuilder();
        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == currentDigit) {
                count += 1;
            }
            else {
                string.append(count);
                string.append(currentDigit);
                currentDigit = previous.charAt(i);
                count = 1;
            }
        }
        string.append(count);
        string.append(currentDigit);
        return new String(string);
    }
}
