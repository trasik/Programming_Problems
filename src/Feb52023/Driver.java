package Feb52023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Pascal's Triangle
        System.out.println(Arrays.toString(generate(5).toArray()));
        System.out.println(Arrays.toString(generate(1).toArray()));
        System.out.println(Arrays.toString(generate(10).toArray()));

        //Problem 2: Best Time to Buy and Sell Stock
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println("Max Profit for Prices " + Arrays.toString(prices1) + ": " + maxProfit(prices1));
        System.out.println("Max Profit for Prices " + Arrays.toString(prices2) + ": " + maxProfit(prices2));
    }

    //Problem 1: Pascal's Triangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows < 1 || numRows > 30) return triangle;

        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num1 = triangle.get(i - 1).get(j);
                    int num2 = triangle.get(i - 1).get(j - 1);

                    row.add(num1 + num2);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    //Problem 2: Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int profit = 0;
        int buy = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy) buy = prices[i];
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }
}
