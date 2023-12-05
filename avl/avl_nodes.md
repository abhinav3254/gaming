SELF PACE

AVL trees are self-balancing binary search trees where the balance factor of each node is maintained to ensure the tree remains approximately balanced. The balance factor is the difference in height between the left and right subtrees of a node.

### AVL Tree Characteristics:

1. **Balanced Structure:**
   - In an AVL tree, for every node, the heights of the left and right subtrees differ by at most one (balance factor is either -1, 0, or 1).

2. **Self-Balancing Property:**
   - After each insertion or deletion operation, the AVL tree checks and performs rotations if necessary to maintain the balanced nature.

### Rotation Types:

1. **Left Rotation:**
   - **Scenario:** Occurs when the balance factor of a node is less than -1, indicating the right subtree is taller.
   - **Use Case:** Rebalances the tree by moving a node from the right subtree to the left.
   - **Example:** Inserting into a right-heavy subtree causes a rebalance by left rotation.

2. **Right Rotation:**
   - **Scenario:** Occurs when the balance factor of a node is greater than 1, indicating the left subtree is taller.
   - **Use Case:** Rebalances the tree by moving a node from the left subtree to the right.
   - **Example:** Inserting into a left-heavy subtree causes a rebalance by right rotation.

3. **Left-Right (LR) and Right-Left (RL) Rotations:**
   - **Scenario:** Needed when single rotations aren't sufficient to rebalance.
   - **Use Case:** Perform a combination of left and right rotations or right and left rotations.
   - **Example:** Inserting into specific subtrees causing LR or RL imbalance situations.

### Example Scenario:

1. **Initial Tree:**
   ```
           30
          /  \
        20    40
       / \     \
     10  25    50
   ```
2. **Insert 5:** Causes imbalance at node 20 (left heavy):
   ```
           30
          /  \
        20    40
       / \     \
      10 25    50
     /
    5
   ```
   - Perform a right rotation at node 20 to rebalance.

3. **After Right Rotation:**
   ```
           30
          /  \
         10   40
        / \    \
       5  20   50
            \
             25
   ```

### When to Perform Rotations:

- **Left Rotation:** Balance factor < -1 (right-heavy)
- **Right Rotation:** Balance factor > 1 (left-heavy)
- **LR Rotation:** Left child of right-heavy node becomes left-heavy.
- **RL Rotation:** Right child of left-heavy node becomes right-heavy.

Rotations in AVL trees are performed to maintain balance after insertions or deletions. By adhering to these rotation rules, AVL trees ensure a balanced structure, optimizing search, insertion, and deletion operations to achieve logarithmic time complexity.
