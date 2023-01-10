# January 10, 2023 Problems

## 1. Running Sum of 1d Array

---
**Prompt:** Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

**Constraints:**
- 1 <= nums.length <= 1000
- -10<sup>6</sup> <= nums[i] <= 10<sup>6</sup>

**Example:**
`Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].`

## 2. Find Pivot Index

---
**Prompt:** Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

**Constraints:**
- 1 <= nums.length <= 10<sup>4</sup> 
- -1000 <= nums[i] <= 1000

**Example:**
`Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11`


