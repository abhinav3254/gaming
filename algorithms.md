# Algorithms Overview

This repository contains implementations and explanations for various algorithms in computer science and mathematics.

## Boyer-Moore Majority Voting Algorithm

The Boyer-Moore Majority Voting Algorithm is used to find the majority element in a sequence efficiently, requiring only O(n) time complexity. The algorithm identifies a majority element (an element that appears more than n/2 times) by continuously canceling out pairs of different elements. This process results in the majority element remaining if one exists.

## Binary Exponentiation Algorithm

The Binary Exponentiation Algorithm is utilized to calculate the power of a number in O(log n) time complexity. It optimizes the process of exponentiation by using the binary representation of the exponent. By breaking down the exponent into its binary form, this algorithm reduces the number of multiplications needed to calculate the power efficiently.

## Floyd's Tortoise and Hare Algorithm (Cycle Detection)

The Floyd's Tortoise and Hare algorithm, also known as the cycle detection algorithm, is a technique primarily used to detect cycles or loops within sequences, especially in linked lists or arrays.

### Methodology:

1. Initialize two pointers, typically named tortoise and hare, pointing to the start of the sequence.
2. Move the tortoise one step at a time and the hare two steps at a time within the sequence.
3. If the hare reaches the end of the sequence (i.e., a null/none value or an end marker), there's no cycle.
4. If the hare and tortoise pointers meet at some point, it indicates the presence of a cycle.

This method is employed in various applications, such as in computer science for cycle detection in linked lists and graph algorithms or in mathematics for determining repeating patterns or cycles in sequences.


## digital root formula --> explained inside leetcode 258.md