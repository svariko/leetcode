package main.test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.BuyAndSellStock2;


public class BuyAndSellStock2Test {

    @Test
    public void test1() {

        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = new int[] {7, 1, 5, 3, 6, 4};

        int expectedProfit = 7;

        assertEquals(expectedProfit, buyAndSellStock2.maxProfit(input));
    }

    @Test
    public void test2() {

        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = new int[] {1, 2, 3, 4, 5};

        int expectedProfit = 4;

        assertEquals(expectedProfit, buyAndSellStock2.maxProfit(input));
    }

    @Test
    public void test3() {
        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = new int[] {7, 6, 4, 3, 1};

        int expectedOutput = 0;

        assertEquals(expectedOutput, buyAndSellStock2.maxProfit(input));
    }

    @Test
    public void test4() {

        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = new int[] {7, 1, 5, 7, 6, 4};
        int expectedProfit = 6;

        assertEquals(expectedProfit, buyAndSellStock2.maxProfit(input));


    }

    @Test
    public void test5() {

        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = null;

        int expectedProfit = 0;

        assertEquals(expectedProfit, buyAndSellStock2.maxProfit(input));
    }

    @Test
    public void test6() {

        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = new int[0];

        int expectedProfit = 0;

        assertEquals(expectedProfit, buyAndSellStock2.maxProfit(input));
    }

    @Test
    public void test7() {

        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

        int[] input = new int[] {0,0,0,0,8};
        int expectedProfit = 8;

        assertEquals(expectedProfit, buyAndSellStock2.maxProfit(input));
    }


}



