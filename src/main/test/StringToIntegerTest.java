package main.test;

import main.java.StringToInteger;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StringToIntegerTest {
    private StringToInteger stringToInteger;

    @Before
    public void setUp() {
        stringToInteger = new StringToInteger();
    }

    @Test
    public void test01() {
        String input = "42";
        int expectedOutput = 42;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test02() {
        String input = "   -42";
        int expectedOutput = -42;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test03() {
        String input = "4193 with words";
        int expectedOutput = 4193;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test04() {
        String input = "words and 987";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test05() {
        String input = "-91283472332";
        int expectedOutput = -2147483648;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test06() {
        String input = "2147483648";
        int expectedOutput = 2147483647;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test07() {
        String input = "   -8389";
        int expectedOutput = -8389;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test08() {
        String input = "+0042";
        int expectedOutput = 42;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test09() {
        String input = "0089";
        int expectedOutput = 89;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test10() {
        String input = "+89889sdfsf";
        int expectedOutput = 89889;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test11() {
        String input = "-+12";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test12() {
        String input = "000000000000000000";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test13() {
        String input = " ";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }

    @Test
    public void test14() {
        String input = "-2147483648";
        int expectedOutput = -2147483648;

        assertEquals(expectedOutput, stringToInteger.myAtoi(input));
    }
}
