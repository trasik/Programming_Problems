# February 5, 2023  Problems

## 1. Pascal's Triangle

---
**Prompt:** Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

**Constraints:**
- 1 <= numRows <= 30

**Example:**
`Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]`

## 2. Best Time to Buy and Sell Stock

---
**Prompt:** You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

**Constraints:**
- 1 <= prices.length <= 10<sup>5</sup> 
- 0 <= prices[i] <= 10<sup>4</sup>

**Example:**
`Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.`
