package main.test;

import main.java.StrStr;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StrStrTest {

    private StrStr strStr;

    @Before
    public void setUp() {
        strStr = new StrStr();
    }

    @Test
    public void test1() {
        String haystack = "hello";
        String needle = "ll";
        int expectedOutput = 2;

        assertEquals(expectedOutput, strStr.strStr(haystack, needle));
    }

    @Test
    public void test2() {
        String haystack = "aaaaa";
        String needle = "bba";
        int expectedOutput = -1;

        assertEquals(expectedOutput, strStr.strStr(haystack, needle));
    }

    @Test
    public void test3() {
        String haystack = "helallo";
        String needle = "ll";
        int expectedOutput = 4;

        assertEquals(expectedOutput, strStr.strStr(haystack, needle));
    }

    @Test
    public void test4() {
        String haystack = "mississippi";
        String needle = "issip";
        int expectedOutput = 4;

        assertEquals(expectedOutput, strStr.strStr(haystack, needle));
    }

    @Test
    public void test5() {
        String haystack = "";
        String needle = "";
        int expectedOutput = 0;

        assertEquals(expectedOutput, strStr.strStr(haystack, needle));
    }

}
