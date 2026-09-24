# Day 1 — Arrays, Hashing, Intervals and Greedy Scans

| Session | Pattern focus | Solutions |
|---|---|---|
| Session 1 | Array scanning, Kadane, frequency counting, partitioning and matrix simulation | [Kadane Max Subarray](session1/KadaneMaxSubArray.java), [Ransom Note](session1/RansomNote.java), [Sort Colors](session1/SortColors.java), [Spiral Matrix](session1/SpiralMatrix.java) |
| Session 2 | Sort + two pointers, interval merging/scheduling and Boyer–Moore | [2Sum / 3Sum](session2/Three3Sum2Sum.java), [Intervals](session4/Intervals/Intervals.java), [Meeting Room](session4/Intervals/MeetingRoom.java), [Majority Element](session2/MajorityElement.java) |
| Session 3 | Running minimum and stock-series scans | [Stock Series 1](session3/StockSeries1.java), [Stock Series 2](session3/StockSeries2.java) |

Recognition cues: contiguous best sum → Kadane; target combinations → hash/two pointers; overlapping ranges → sort intervals; one transaction → running minimum.

# Main sub-patterns
| Sub-pattern | Pointer movement | Common clues | Examples |
|---|---|---|---|
| Opposite-direction pointers | `left →`, `right ←` | Sorted array, palindrome, reverse | Two Sum II, 3Sum, Container With Most Water |
| Same-direction / read-write | Both move left-to-right | In-place modification | Remove duplicates, move zeroes |
| Sliding window | Expand right; shrink left when invalid | Contiguous subarray/substring | Longest unique substring, min-size subarray |
| Fast and slow pointers | Fast moves 2 steps, slow moves 1 | Linked list cycle/middle | Cycle detection, middle node |
| Two sorted sequences | Advance smaller/current item | Merge/intersection | Merge sorted arrays, intervals |
| Partitioning | Scan plus boundary pointer(s) | Rearrange by condition | Sort colors, quicksort partition |


# Sliding-window decision rule
| Goal | What to do once window is valid? |
|---|---|
| Longest valid window | Record answer, keep expanding unless it becomes invalid |
| Shortest valid window | Record answer, then shrink as much as possible |
| Count valid subarrays | Often add `right - left + 1` after restoring validity |


# Interview method: how to explain your approach
Say this before coding:
1. “The input is sorted / the requirement is contiguous / we need in-place changes.”
2. “I’ll use two pointers to avoid rechecking combinations.”
3. “My invariant is: [describe what the current window or processed section means].”
4. “Each pointer moves at most n times, so time is O(n) (or O(n²) for sorted 3Sum).”
   Example for a longest-substring problem:
   “I’ll maintain a window from left to right containing no duplicates. I expand with right; if a duplicate appears, I move left until the window is valid again. Since each character enters and leaves the window at most once, this is O(n).”

# Common mistakes
- Using sliding window when the question is not about a contiguous range.
- Forgetting that array indices use right - left + 1.
- Moving both pointers without explaining why.
- Forgetting to skip duplicates in 3Sum-style problems.
- Updating the answer at the wrong time:
    - longest: after validity is restored
    - minimum: while the window remains valid and you shrink it
- Using a positive-number window-sum method when negative values exist.
- In linked lists, forgetting fast != null && fast.next != null.
- You need non-negative values. With negative values, removing a number might increase the sum, breaking the normal window logic.

#

Hard interviewer question:
Can you use a normal sliding window if the array contains negative values?

Strong answer:
Not always. The sum is no longer monotonic as the window grows or shrinks. I would consider prefix sums with a HashMap, or a monotonic deque depending on the exact problem.
# Quick pattern cheat sheet
Sorted pair / palindrome / reverse?
→ left and right from opposite ends

In-place remove/filter/rearrange?
→ read and write pointers

Contiguous substring/subarray?
→ sliding window: left + right

Linked list cycle/middle/kth from end?
→ slow + fast pointers

Two sorted arrays/lists?
→ one pointer per input

Group values into regions?
→ partition pointers


# How to decide which pointer pattern to use

Sorted array + find a pair?
→ left/right pointers

Contiguous subarray or substring?
→ sliding window

Remove/filter elements in-place?
→ read/write pointers

Linked-list middle or cycle?
→ slow/fast pointers

Two sorted arrays/lists?
→ one pointer per sequence

Three categories / partition around a pivot?
→ Dutch National Flag

# Recognition by goal

| Goal | Pointer rule |
|---|---|
| Merge two arrays | Take smaller value; move that pointer |
| Intersection/common elements | Equal: save and move both. Smaller: move smaller pointer |
| Union | Add smaller; equal: add once and move both |
| Compare arrays | Compare current values, move based on result |
| Common intervals | Move the interval whose end finishes first |
| Pair sum from two arrays | If sum too small, move smaller-side pointer; if too large, move other pointer |


# How to recognize which variation to apply (MERGE INTERVAL)

| Question asks for | What to do |
|---|---|
| Combine both sorted inputs | Merge: take smaller |
| Values present in both | Intersection: move smaller, save when equal |
| All values without duplicates | Union: take smaller, handle equal once |
| A pair with a target sum | One pointer left, one pointer right |
| Overlap between interval lists | Find overlap; move earlier-ending interval |
| Compare two sorted linked lists | Advance the pointer with the smaller node |


# A simple interview checklist
1. Are there two inputs?
2. Are they sorted, or can I sort them?
3. Can I compare their current values to eliminate one safely?
4. Does each pointer only need to move forward?


# Edge cases interviewers expect you to mention
1. Before coding, think through:
2. null input?
3. empty array?
4. one element?
5. all values the same?
6. already sorted?
7. reverse sorted?
8. duplicates?
9. negative values?
10. integer overflow?


# Must know
1. Same-direction read/write
    - Remove duplicates
    - Move zeroes
    - Filter in place
    - “Why does write move only when keeping a value?”
2. Opposite-direction pointers
    - Two Sum II
    - Valid Palindrome
    - Container With Most Water
    - 3Sum
    - “Why is moving this pointer safe?”
3. Sliding window
    - Longest substring without repeating characters
    - At most k distinct / replacements
    - Minimum-size subarray sum
    - Know longest vs minimum-window logic
    - Know non-negative sums limitation
4. Fast/slow linked-list pointers
    - Cycle detection
    - Middle node
    - kth node from end
    - Palindrome linked list
5. Two sorted sequences
    - Merge
    - Intersection
    - Union
    - In-place merge from the end
    - Interval intersection
6. Partitioning
    - Move zeroes / positives and negatives
    - Sort Colors / Dutch National Flag
    - Partition around pivot
7. k-Sum
    - 3Sum very well
    - Duplicate handling
    - Understand 4Sum is the same idea: fix more values, then two pointers

# The skill you most need to develop  

1. What does each pointer represent?
2. What region/range is already processed?
3. Why is this pointer movement safe?
4. Can the pointer ever move backward?
5. What happens with duplicates?
6. What are the edge cases?



