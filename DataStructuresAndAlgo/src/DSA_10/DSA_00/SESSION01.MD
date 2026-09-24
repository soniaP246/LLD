FirstUniqueCharacterInAString.java
================================================================
     * 2. 📘 PRIMARY PROBLEM
     * ================================================================
     *SORTCOLOR.JAVA
     *SPIRALMAtrix.java
     * Title:
     * Ransom Note
     *
     * Difficulty:
     * Easy
     *
     * Tags:
     * Hash Table
     * Array
     * Counting
     * Frequency Table
     * Greedy Counting
     *
     * LeetCode:
     * https://leetcode.com/problems/ransom-note/
     *
     * Problem Description
     * -------------------
     * Given two strings:
     *
     *     ransomNote
     *     magazine
     *
     * determine whether ransomNote can be constructed using characters
     * from magazine.
     *
     * Every character in magazine may be used at most once.
     *
     * Return true if construction is possible.
     * Otherwise return false.
     *
     * Constraints
     * -----------
     * 1 <= ransomNote.length, magazine.length <= 100000
     * ransomNote and magazine contain only lowercase English letters.
     *
     * Representative Examples
     * -----------------------
     *
     * Example 1
     * ransomNote = "a"
     * magazine   = "b"
     * Output = false
     *
     * Explanation
     * Magazine does not contain 'a'.
     *
     * ------------------------------------------------
     *
     * Example 2
     * ransomNote = "aa"
     * magazine   = "ab"
     * Output = false
     *
     * Explanation
     * Only one 'a' exists.
     *
     * ------------------------------------------------
     *
     * Example 3
     * ransomNote = "aa"
     * magazine   = "aab"
     * Output = true
     *
     * Explanation
     * Magazine contains two copies of 'a'.
     */

    /*


