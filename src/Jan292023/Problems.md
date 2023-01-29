# January 29, 2023 Problems

## 1. Remove Nth Node from End of List 

---
**Prompt:** Given the head of a linked list, remove the nth node from the end of the list and return its head.

**Constraints:**
- The number of nodes in the list is sz. 
- 1 <= sz <= 30 
- 0 <= Node.val <= 100 
- 1 <= n <= sz

**Example:**
`Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]`

## 2. Palindrome LinkedList

---
**Prompt:** Given the head of a singly linked list, return true if it is a
palindrome
or false otherwise.

**Constraints:**
- The number of nodes in the list is in the range [1, 10<sup>5</sup>]. 
- 0 <= Node.val <= 9

**Example:**
`Input: head = [1,2,2,1]
Output: true`

## 3. Odd Even Linked List

---
**Prompt:** Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

**Constraints:**
- The number of nodes in the linked list is in the range [0, 10<sup>4</sup>]. 
- -10<sup>6</sup> <= Node.val <= 10<sup>6</sup>

**Example:**
`Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]`
