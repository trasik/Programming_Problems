<!--Default Layout: 
# Date Problems

## 1. Title

---
**Prompt:** 

**Constraints:**
-

**Example:**
``
-->

# January 11, 2023 Problems

## 1. Isomorphic Strings

---
**Prompt:** Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

**Constraints:**
- 1 <= s.length <= 5 * 10<sup>4</sup> 
- t.length == s.length 
- s and t consist of any valid ascii character.

**Example:**
`Input: s = "egg", t = "add"
Output: true`

## 2. Is Subsequence

---
**Prompt:** Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

**Constraints:**
- 0 <= s.length <= 100 
- 0 <= t.length <= 10<sup>4</sup> 
- s and t consist only of lowercase English letters.

**Example:**
`Input: s = "abc", t = "ahbgdc"
Output: true`