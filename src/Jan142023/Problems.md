# January 14, 2023 Problems

## 1. Linked List Cycle II

---
**Prompt:** Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

**Constraints:**
- The number of the nodes in the list is in the range [0, 10<sup>4</sup>]. 
- -10<sup>5</sup> <= Node.val <= 10<sup>5</sup> 
- pos is -1 or a valid index in the linked-list.

**Example:**
`Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.`

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

