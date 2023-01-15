# January 15, 2023 Problems

## 1. N-ary Tree Preorder Traversal

---
**Prompt:** Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

**Constraints:**
- The number of nodes in the tree is in the range [0, 10<sup>4</sup>]. 
- 0 <= Node.val <= 10<sup>4</sup> 
- The height of the n-ary tree is less than or equal to 1000.

**Example:**
`Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]`

## 2. Binary Tree Level Order Traversal

---
**Prompt:** Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

**Constraints:**
- The number of nodes in the tree is in the range [0, 2000]. 
- -1000 <= Node.val <= 1000

**Example:**
`Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]`