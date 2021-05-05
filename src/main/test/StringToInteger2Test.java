package main.test;

import main.java.StringToInteger2;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StringToInteger2Test {

    private StringToInteger2 stringToInteger2;

    @Before
    public void setUp() {
        stringToInteger2 = new StringToInteger2();
    }

    @Test
    public void test01() {
        String input = "2147483647";
        boolean isPositive = true;

        assertTrue(stringToInteger2.isWithinIntRange(input, isPositive));
    }

    @Test
    public void test02() {
        String input = "2147483648";
        boolean isPositive = false;

        assertTrue(stringToInteger2.isWithinIntRange(input, isPositive));
    }

    @Test
    public void test03() {
        String input = "2147483648";
        boolean isPositive = true;

        assertFalse(stringToInteger2.isWithinIntRange(input, isPositive));
    }

    @Test
    public void test04() {
        String input = "2147483649";
        boolean isPositive = false;

        assertFalse(stringToInteger2.isWithinIntRange(input, isPositive));
    }

    @Test
    public void test05() {
        String input = "589";
        boolean isPositive = true;
        int expectedValue = 589;

        assertEquals(expectedValue, stringToInteger2.getIntFromDigits(input, isPositive));
    }

    @Test
    public void test06() {
        String input = "589";
        boolean isPositive = false;
        int expectedValue = -589;

        assertEquals(expectedValue, stringToInteger2.getIntFromDigits(input, isPositive));
    }

    @Test
    public void test07() {
        String input = "2147483648";
        boolean isPositive = false;
        int expectedValue = -2147483648;

        assertEquals(expectedValue, stringToInteger2.getIntFromDigits(input, isPositive));
    }

    @Test
    public void test08() {
        String input = "2147483647";
        boolean isPositive = true;
        int expectedValue = 2147483647;

        assertEquals(expectedValue, stringToInteger2.getIntFromDigits(input, isPositive));
    }

    @Test
    public void test09() {
        String input = "0";
        boolean isPositive = true;
        int expectedValue = 0;

        assertEquals(expectedValue, stringToInteger2.getIntFromDigits(input, isPositive));
    }

    @Test
    public void test10() {

        String input = "0";
        boolean isPositive = false;
        int expectedValue = 0;

        assertEquals(expectedValue, stringToInteger2.getIntFromDigits(input, isPositive));

    }

    @Test
    public void test11() {
        int expectedValue = 2147483647;

        assertEquals(expectedValue, stringToInteger2.getClampedValue(true));
    }

    @Test
    public void test12() {
        int expectedValue = -2147483648;

        assertEquals(expectedValue, stringToInteger2.getClampedValue(false));
    }


    @Test
    public void test13() {
        String input = "42";
        int expectedOutput = 42;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test14() {
        String input = "   -42";
        int expectedOutput = -42;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test15() {
        String input = "4193 with words";
        int expectedOutput = 4193;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test16() {
        String input = "words and 987";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test17() {
        String input = "-91283472332";
        int expectedOutput = -2147483648;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test18() {
        String input = "2147483648";
        int expectedOutput = 2147483647;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test19() {
        String input = "   -8389";
        int expectedOutput = -8389;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test20() {
        String input = "+0042";
        int expectedOutput = 42;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test21() {
        String input = "0089";
        int expectedOutput = 89;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test22() {
        String input = "+89889sdfsf";
        int expectedOutput = 89889;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test23() {
        String input = "-+12";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test24() {
        String input = "000000000000000000";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test25() {
        String input = " ";
        int expectedOutput = 0;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void test26() {
        String input = "-2147483648";
        int expectedOutput = -2147483648;

        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }

    @Test
    public void testGetNonZeroIndexWhenZeroPadded() {
        String input = "000042";
        int expectedOutput = 4;

        assertEquals(expectedOutput, stringToInteger2.getNonZeroStartIndex(input));

    }

    @Test
    public void testGetNonZeroIndexWhenOnlyZeros() {
        String input = "00000000000000000000000";
        int expectedOutput = -1;

        assertEquals(expectedOutput, stringToInteger2.getNonZeroStartIndex(input));
    }

    @Test
    public void testGetNonZeroIndexFromZero() {
        String input = "0";
        int expectedOutput = -1;
        assertEquals(expectedOutput, stringToInteger2.getNonZeroStartIndex(input));

    }

    @Test
    public void testGetNonSpaceStartFromSpacePadded() {
        String input = "      42";
        int expectedOutput = 6;
        assertEquals(expectedOutput, stringToInteger2.getNonSpaceStartIndex(input));
    }

    @Test
    public void testGetNonSpaceStartFromSpacesOnly() {
        String input = "              ";
        int expectedOutput = -1;
        assertEquals(expectedOutput, stringToInteger2.getNonSpaceStartIndex(input));
    }

    @Test
    public void testDigitsLengthSameAsMaxNonNumericEnding() {
        String input = "1095502006p8";
        int expectedOutput = 1095502006;
        assertEquals(expectedOutput, stringToInteger2.myAtoi(input));
    }
}
