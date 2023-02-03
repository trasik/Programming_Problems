# February 3, 2023 Problems

## 1. Title

---
**Prompt:** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Constraints:**
- 1 <= nums.length <= 10<sup>4</sup>
- -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
- nums contains distinct values sorted in ascending order. 
- -10<sup>4</sup> <= target <= 10<sup>4</sup>

**Example:**
`Input: nums = [1,3,5,6], target = 5
Output: 2`

## 2. Climbing Stairs

---
**Prompt:** You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

**Constraints:**
- 1 <= n <= 45

**Example:**
`Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps`