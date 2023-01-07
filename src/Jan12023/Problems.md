#January 7, 2023 Problems

##1. Max Consecutive Ones

---
**Prompt:** Given a binary array nums, return the maximum number of consecutive 1's in the array.

**Constraints:** 
- 1 <= nums.length <= 10<sup>5</sup>
- nums[i] is either 0 or 1.

**Example:**
`Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.`

##2. Find Numbers with Even Number of Digits

---
**Prompt:** Given an array nums of integers, return how many of them contain an even number of digits.

**Constraints:**
- 1 <= nums.length <= 500
- 1 <= nums[i] <= 10<sup>5</sup>

**Example:**
`Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.`

##3. Squares of a Sorted Array

---
**Prompt:** Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

**Constraints:**
- 1 <= nums.length <= 10<sup>4</sup>
- -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
- nums is sorted in non-decreasing order.

**Example:**
`Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].`
