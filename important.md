Sorting Algorithm and their complexity


1. **Bubble Sort**:
   - Average Complexity: O(n^2)

2. **Selection Sort**:
   - Average Complexity: O(n^2)

3. **Insertion Sort**:
   - Average Complexity: O(n^2)

4. **Merge Sort**:
   - Average Complexity: O(n log n)

5. **Quick Sort**:
   - Average Complexity: O(n log n)

6. **Heap Sort**:
   - Average Complexity: O(n log n)

7. **Counting Sort**:
   - Average Complexity: O(n + k), where k is the range of the non-negative key values

8. **Radix Sort**:
   - Average Complexity: O(n * k), where k is the number of digits in the maximum number

9. **Bucket Sort**:
   - Average Complexity: O(n + k), where k is the number of buckets

Remember, these complexities are in terms of comparisons and swaps made during the sorting process. The actual performance can vary based on various factors like implementation, data distribution, and optimizations applied.

-----------------------------------------------------------------------------------------------------

Searching Algorithm and their complexity

Sure, there are several searching algorithms. Here are a few along with their complexities:

1. **Linear Search**:
   - Complexity: O(n)
   - In linear search, each element of the list is checked until the desired element is found or the entire list has been traversed.

2. **Binary Search (for sorted arrays)**:
   - Complexity: O(log n)
   - Binary search works on sorted arrays by repeatedly dividing the search interval in half until the element is found.

3. **Hashing (Hash Table)**:
   - Average Complexity: O(1) for successful searches (depends on the hash function and collision resolution)
   - Hashing involves using a hash function to map keys to certain values. Searching in a hash table can be very fast, often considered constant time, but this depends on the quality of the hash function and the handling of collisions.

4. **Jump Search**:
   - Complexity: O(√n) for sorted arrays
   - Jump search is similar to binary search but jumps a fixed number of steps ahead instead of dividing the array in half.

5. **Interpolation Search (for uniformly distributed sorted arrays)**:
   - Complexity: O(log log n) on average, O(n) in the worst case
   - Interpolation search improves upon binary search by calculating the probable position of the desired element.

6. **Exponential Search (for unbounded/infinite arrays)**:
   - Complexity: O(log n)
   - Exponential search involves finding a range where the element could be present and then using binary search within that range.

Each searching algorithm has its strengths and weaknesses, and the choice of algorithm often depends on factors such as the size and nature of the dataset, whether the data is sorted, and the constraints of the problem you're solving.
