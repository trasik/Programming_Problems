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

## 2. Lowest Common Ancestor of a Binary Search Tree

---
**Prompt:** Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

**Constraints:**
- The number of nodes in the tree is in the range [2, 10<sup>5</sup>]. 
- -10<sup>9</sup> <= Node.val <= 10<sup>9</sup> 
- All Node.val are unique. 
- p != q 
- p and q will exist in the BST.

**Example:**
`Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.`