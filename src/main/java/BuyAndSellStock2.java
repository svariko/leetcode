package main.java;

public class BuyAndSellStock2 {

    public int maxProfit(int[] prices) {

        // Assume invalid inputs return a profit of 0
        if (prices == null || prices.length == 0) {
            return 0;
        }

        // Set up initial buy and sell days and initial accumulated profit
        int accumulatedProfit = 0;
        int buyValue = prices[0];
        int sellValue = prices[0];

        for (int i = 0; i < prices.length; i++) {

            // The day's price is lower than the best price to sell so far
            if (prices[i] < sellValue) {

                // Make the sale and add this to the profit
                accumulatedProfit += sellValue - buyValue;
                buyValue = prices[i];
                sellValue = prices[i];
            }

            // A better sale price was found so set this to your best price to sell so far
            else if (prices[i] >= sellValue) {
                sellValue = prices[i];

            }
        }

        // If no sale was made, make the sale
        accumulatedProfit += sellValue - buyValue;

        return accumulatedProfit;
    }
}
