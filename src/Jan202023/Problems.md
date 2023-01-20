# January 20, 2023 Problems

## 1. Min Cost Climbing Stairs

---
**Prompt:** You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

**Constraints:**
- 2 <= cost.length <= 1000 
- 0 <= cost[i] <= 999

**Example:**
`Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
Pay 15 and climb two steps to reach the top.
  The total cost is 15.`

## 2. Unique Paths

---
**Prompt:** There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

**Constraints:**
- 1 <= m, n <= 100

**Example:**
`Input: m = 3, n = 7
Output: 28`