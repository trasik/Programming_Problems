# January 21, 2023 Problems

## 1. Find All Anagrams in a String

---
**Prompt:** Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Constraints:**
- 1 <= s.length, p.length <= 3 * 10<sup>4</sup> 
- s and p consist of lowercase English letters.

**Example:**
`Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".`

## 2. Longest Repeating Character Replacement

---
**Prompt:** You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

**Constraints:**
- 1 <= s.length <= 10<sup>5</sup> 
- s consists of only uppercase English letters. 
- 0 <= k <= s.length

**Example:**
`Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.`