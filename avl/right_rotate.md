rightRotate() explaination :- 

Consider the following AVL tree:
```
     30
    /  \
  20    40
 / \     \
10  25    50

```


Now, let's perform a right rotation on node 30:

Before Rotation:

     30
    /  \
  20    40
 / \     \
10  25    50


After Right Rotation:

     20
    /  \
  10    30
       /  \
     25    40
            \
            50


Explanation:

Step 1: Node y is 30, and x is 20 (the left child of y). T2 is 25 (the right child of x).

Step 2: Rotate the nodes:

x.right = y: Make y the right child of x.
y.left = T2: Make T2 the left child of y.
Step 3: Update heights:

Update the height of y (Node 30) and x (Node 20) after the rotation.
Step 4: Return the new root node (x), which becomes the root of the subtree after the rotation.


After the right rotation on node 30, the tree is balanced, with node 20 becoming the new root of the subtree, and the heights of the nodes are appropriately adjusted to maintain the AVL tree properties.





@author abhinav3254
