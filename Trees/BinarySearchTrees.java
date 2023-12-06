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
    }
}
