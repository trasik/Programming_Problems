# January 16, 2023 Problems

## 1. Binary Search

---
**Prompt:** Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

**Constraints:**
- 1 <= nums.length <= 10<sup>4</sup> 
- -10<sup>4</sup> < nums[i], target < 10<sup>4</sup> 
- All the integers in nums are unique. 
- nums is sorted in ascending order.

**Example:**
`Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4`

## 2. First Bad Version

---
**Prompt:** You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

**Constraints:**
- 1 <= bad <= n <= 2<sup>31</sup> - 1

**Example:**
`Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.`

