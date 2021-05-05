package main.test;

import main.java.FirstUniqueCharacterInString;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FirstUniqueCharacterInStringTest {
    private FirstUniqueCharacterInString firstUniqueCharacterInString;

    @Before
    public void setUp() {
        firstUniqueCharacterInString = new FirstUniqueCharacterInString();
    }

    @Test
    public void test1() {
        String input = "leetcode";
        int expectedOutput = 0;

        assertEquals(expectedOutput, firstUniqueCharacterInString.firstUniqChar(input));
    }

    @Test
    public void test2() {
        String input = "loveleetcode";
        int expectedOutput = 2;

        assertEquals(expectedOutput, firstUniqueCharacterInString.firstUniqChar(input));
    }

    @Test
    public void test3() {
        String input = "aaaaa";
        int expectedOutput = -1;

        assertEquals(expectedOutput, firstUniqueCharacterInString.firstUniqChar(input));
    }

    @Test
    public void test4() {
        String input = "aaaaaaab";
        int expectedOutput = 7;

        assertEquals(expectedOutput, firstUniqueCharacterInString.firstUniqChar(input));
    }

    @Test
    public void test5() {
        String input = "abbbbbbbbbca";
        int expectedOutput = 10;

        assertEquals(expectedOutput, firstUniqueCharacterInString.firstUniqChar(input));
    }

}
