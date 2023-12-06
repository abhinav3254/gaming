# Binary Search Trees (BST) Notes

## Overview

A Binary Search Tree (BST) is a tree data structure that maintains a set of elements in a sorted order. Each node in the BST has at most two children: a left child and a right child. The key property of a BST is that the value of each node in the left subtree is less than the value of the node itself, and the value of each node in the right subtree is greater than the value of the node itself.

## Basic Structure

### Node Structure

A typical node in a Binary Search Tree contains the following components:

```java
class Node {
    int data;        // The data stored in the node
    Node left;       // Reference to the left child node
    Node right;      // Reference to the right child node

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
```

### BinarySearchTree Class

The `BinarySearchTree` class encapsulates the functionality of a BST. It typically includes methods for insertion, deletion, search, and traversal.

```java
class BinarySearchTree {
    Node root;       // The root of the BST

    // Constructor (optional, depending on use case)

    // Methods: insert, delete, search, traversal
}
```

## Insertion

The insertion operation in a BST follows these rules:

1. If the tree is empty, the new node becomes the root.
2. If the value to be inserted is less than the current node's value, move to the left subtree.
3. If the value is greater, move to the right subtree.
4. Repeat steps 2 and 3 until an appropriate empty spot is found, then insert the new node.

### Insertion Algorithm

```java
static Node insert(Node node, int data) {
    if (node == null) {
        return new Node(data);
    } else if (data < node.data) {
        node.left = insert(node.left, data);
    } else if (data > node.data) {
        node.right = insert(node.right, data);
    }
    return node;
}
```

## Traversal

Traversal is the process of visiting all nodes in the BST in a specific order. Common traversal methods are:

1. **In-Order Traversal:** Visit left subtree, current node, right subtree.
2. **Pre-Order Traversal:** Visit current node, left subtree, right subtree.
3. **Post-Order Traversal:** Visit left subtree, right subtree, current node.

### Traversal Algorithm
#### In-Order Traversal
```java
static void inOrderTraversal(Node node) {
    if (node != null) {
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
}
```
#### Pre-Order Traversal
```java
static void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
```
#### Post-Order Traversal
```java
static void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }
```

## Deletion

Deleting a node from a BST involves three cases:

1. **Node with no children (Leaf):** Simply remove the node.
2. **Node with one child:** Remove the node and replace it with its child.
3. **Node with two children:** Find the node's in-order successor (or predecessor), replace the node's value with the successor's (or predecessor's) value, and then recursively delete the successor (or predecessor).

### Deletion Algorithm

```java
static Node delete(Node root, int key) {
    // Deletion logic
}
```

## Searching

Searching in a BST involves comparing the target value with the values of nodes and moving left or right based on the comparison until the target is found or the tree is exhausted.

### Search Algorithm

```java
static Node search(Node root, int key) {
    // Search logic
}
```

## Advantages and Use Cases

1. **Efficient Search:** Searching in a BST has a time complexity of O(log n) on average.
2. **Ordered Data Storage:** Data is stored in a sorted order, making range queries and floor/ceiling operations efficient.
3. **Efficient Insertion and Deletion:** Balanced BSTs ensure logarithmic time complexity for insertions and deletions.

## Disadvantages and Considerations

1. **Balancing:** Unbalanced trees (skewed) can lead to performance issues (e.g., O(n) time complexity for search).
2. **Memory Overhead:** Additional memory is required for storing pointers, which can be significant for large datasets.
3. **Complexity:** Implementing and maintaining a balanced BST can be complex compared to simpler data structures.

## Conclusion

Binary Search Trees provide an efficient way to organize and search data in a sorted order. Understanding their basic principles, operations, and considerations is crucial for utilizing them effectively in various applications. Proper balancing techniques, such as AVL trees or Red-Black trees, can address some of the limitations associated with unbalanced BSTs.



The time and space complexity of each operation in a Binary Search Tree (BST) can vary depending on the implementation and the balancing properties of the tree. Here, I'll provide general information based on the average case in a balanced BST.

### Time Complexity:

1. **Search (average):**
   - Time Complexity: O(log n)
   - Explanation: In a balanced BST, the height of the tree is logarithmic in the number of nodes, ensuring efficient search operations.

2. **Search (worst case, unbalanced):**
   - Time Complexity: O(n)
   - Explanation: If the BST is unbalanced (e.g., skewed), the search time complexity can degrade to O(n) as it becomes essentially a linked list.

3. **Insertion (average):**
   - Time Complexity: O(log n)
   - Explanation: Similar to search, insertion in a balanced BST takes logarithmic time.

4. **Insertion (worst case, unbalanced):**
   - Time Complexity: O(n)
   - Explanation: In an unbalanced BST, insertion can take linear time, as it may involve traversing the entire height of the tree.

5. **Deletion (average):**
   - Time Complexity: O(log n)
   - Explanation: Deletion in a balanced BST has an average time complexity of O(log n).

6. **Deletion (worst case, unbalanced):**
   - Time Complexity: O(n)
   - Explanation: In an unbalanced BST, deletion can take linear time in the worst case.

7. **Traversal (in-order, pre-order, post-order):**
   - Time Complexity: O(n)
   - Explanation: Visiting all nodes during a traversal requires linear time.

### Space Complexity:

1. **Space Complexity (average):**
   - Space Complexity: O(n)
   - Explanation: In the average case, the space complexity is O(n) to store n nodes in the tree.

2. **Space Complexity (worst case, unbalanced):**
   - Space Complexity: O(n)
   - Explanation: In the worst case (unbalanced tree), the space complexity remains O(n).

These complexities are based on the assumption of a balanced BST. For self-balancing trees (e.g., AVL trees, Red-Black trees), the worst-case time complexity for search, insertion, and deletion remains O(log n) even in the presence of various operations.

Remember that these are general complexities, and specific implementation details or variations may affect these values.
