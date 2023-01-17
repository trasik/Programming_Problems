# January 17, 2023 Problems

## 1. Validate Binary Search Tree

---
**Prompt:** Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left
subtree
of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

**Constraints:**
- The number of nodes in the tree is in the range [1, 10<sup>4</sup>]. 
- -2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1

**Example:**
`Input: root = [2,1,3]
Output: true`