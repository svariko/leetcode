package main.java;

public class StrStr {
    public int strStr(String haystack, String needle) {


        if (needle.length() == 0) {
            return 0;
        }

        int endIndex = -1;

        int needle_pos = 0;
        int restartHay_pos = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needle_pos)) {
                if (needle_pos == 0) {
                    restartHay_pos = i;
                }
                if (needle_pos == needle.length() - 1) {
                    endIndex = i;
                    break;
                }
                needle_pos += 1;
            }
            else {
                if (needle_pos != 0) {
                    i = restartHay_pos;
                }
                needle_pos = 0;

            }

        }

        if (endIndex != -1) {
            return endIndex - (needle.length() - 1);
        }
        else {
            return endIndex;
        }



    }
}
