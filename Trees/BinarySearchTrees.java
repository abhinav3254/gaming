/**
 * BinarySearchTree class represents a simple binary search tree with basic functionality.
 */
class BinarySearchTree {

    /**
     * Node class represents a node in the binary search tree.
     */
    static class Node {
        int data;      // Data stored in the node
        Node left;     // Reference to the left child node
        Node right;    // Reference to the right child node

        /**
         * Constructor to create a new node with the specified data.
         *
         * @param data The data to be stored in the node.
         */
        public Node(int data) {
            this.data = data;
        }
    }


    /**
     *
     *          1
     *         / \
     *        2   3
     *      /  \
     *     4    5
     *
     * maxDepth(‘1’) = max(maxDepth(‘2’), maxDepth(‘3’)) + 1 = 2 + 1
     *
     * because recursively
     * maxDepth(‘2’) =  max (maxDepth(‘4’), maxDepth(‘5’)) + 1 = 1 + 1 and  (as height of both ‘4’ and ‘5’ are 1)
     * maxDepth(‘3’) = 1
     */
    static int height(Node node) {
        if (node == null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }

    /**
     * Recursive method to insert a new node with the given data into the binary search tree.
     *
     * @param node The root of the current subtree.
     * @param data The data to be inserted into the tree.
     * @return The root of the modified subtree.
     */
    static Node insert(Node node, int data) {
        // If the current node is null, create a new node with the given data.
        if (node == null) {
            return new Node(data);
        } else if (data < node.data) {
            // If the data is less than the current node's data, recursively insert into the left subtree.
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            // If the data is greater than the current node's data, recursively insert into the right subtree.
            node.right = insert(node.right, data);
        }
        return node;
    }

    /**
     * Recursive method to display the contents of the binary search tree in pre-order traversal.
     *
     * @param node The root of the current subtree.
     */
    static void display(Node node) {
        // If the current node is null, return.
        if (node == null) {
            return;
        }
        // Display the data of the current node.
        System.out.println(node.data);
        // Recursively display the left subtree.
        display(node.left);
        // Recursively display the right subtree.
        display(node.right);
    }

    /**
 * Recursively searches for a specific data value in a Binary Search Tree (BST).
 *
 * @param node The root of the current subtree being searched.
 * @param data The data value to search for in the BST.
 * @return True if the data is found in the BST, false otherwise.
 */
static boolean search(Node node, int data) {
    // Base case: If the current node is null, the data is not found.
    if (node == null) {
        return false;
    }

    // Base case: If the data matches the current node's data, it is found.
    else if (data == node.data) {
        return true;
    }

    // Recursive case: If the data is less than the current node's data,
    // search in the left subtree.
    else if (data < node.data) {
        return search(node.left, data);
    }

    // Recursive case: If the data is greater than the current node's data,
    // search in the right subtree.
    else {
        return search(node.right, data);
    }
}


    /**
     * The main method demonstrates the usage of the BinarySearchTree class.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Initialize the root of the tree to null.
        Node root = null;

        // Values to be inserted into the binary search tree.
        int[] valuesToInsert = {50, 30, 70, 20, 40, 60, 80};

        // Insert values into the binary search tree.
        for (int value : valuesToInsert) {
            root = insert(root, value);
        }

        // Display the resulting binary search tree.
        System.out.println("Binary Search Tree:");
        display(root);

        System.out.println("");
        System.out.println("Height of Tree is :- "+height(root));

        System.out.println("element found :- "+search(root,80));
        
    }
}
