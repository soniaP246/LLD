package DSA_10.DSA_01;

public class TwoPointer_Identification {


           /* 1. What does each pointer represent?
            2. What region/range is already processed?
            3. Why is this pointer movement safe?
            4. Can the pointer ever move backward?
            5. What happens with duplicates?
            6. What are the edge cases?
===============================================================================================


How to identify it in an interview

Think “two pointers” when you see:
- A sorted array and a target sum, difference, or pair condition
- Need to find/remove duplicates in-place
- Need to reverse, compare, or validate a string
- Need the longest/shortest contiguous subarray or substring
- A condition that can be fixed by moving a left or right boundary
- Two sorted lists/arrays to compare or merge
- A linked list where you need the middle, cycle, or kth-from-end node
A strong interview question to ask yourself:
“Can I maintain an answer while moving boundaries forward, without restarting from every position?”
===============================================================================================


  | Sub-pattern | Pointer movement | Common clues | Examples |
|---|---|---|---|
| Opposite-direction pointers | `left →`, `right ←` | Sorted array, palindrome, reverse | Two Sum II, 3Sum, Container With Most Water |
| Same-direction / read-write | Both move left-to-right | In-place modification | Remove duplicates, move zeroes |
| Sliding window | Expand right; shrink left when invalid | Contiguous subarray/substring | Longest unique substring, min-size subarray |
| Fast and slow pointers | Fast moves 2 steps, slow moves 1 | Linked list cycle/middle | Cycle detection, middle node |
| Two sorted sequences | Advance smaller/current item | Merge/intersection | Merge sorted arrays, intervals |
| Partitioning | Scan plus boundary pointer(s) | Rearrange by condition | Sort colors, quicksort partition |
}*/


/*
    For practice, start with: Two Sum II, Valid Palindrome, Remove Duplicates from Sorted Array, Move Zeroes, Longest Substring Without Repeating Characters, Minimum Size Subarray Sum, 3Sum, Linked List Cycle, Middle of Linked List, and Sort Colors.
*/

}
