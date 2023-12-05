// Node class representing each node in the AVL Tree
class Node {
    int key, height; // Key value and height of the node
    Node left, right; // References to left and right child nodes

    // Constructor to initialize a node with key and height
    Node(int d) {
        key = d;
        height = 1; // Height initialized as 1 for a newly created node
    }
}

// Public class AVLTree containing methods for AVL tree operations
public class AVLTree {
    Node root; // Reference to the root of the AVL tree

    // Method to calculate the height of a node
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Method to get the maximum of two integers
    int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Performs a right rotation on the AVL tree.
     * This rotation is performed when the balance factor of a node is greater than 1,
     * indicating that the left subtree of the node is taller and causing imbalance.
     * The right rotation helps in rebalancing the tree by adjusting node positions.
     *
     * @param y The node around which the rotation is performed.
     * @return The new root node after the right rotation.
     */
    Node rightRotate(Node y) {
        // Store references to necessary nodes for rotation
        Node x = y.left; // x is the left child of y
        Node T2 = x.right; // T2 is the right child of x

        // Perform rotation: Adjust node positions
        x.right = y; // Make y the right child of x
        y.left = T2; // Make T2 the left child of y (which was the right child of x)

        // Update heights of the affected nodes after rotation
        y.height = max(height(y.left), height(y.right)) + 1; // Update height of y
        x.height = max(height(x.left), height(x.right)) + 1; // Update height of x

        return x; // Return the new root node after the rotation
    }


    /**
     * Performs a left rotation on the AVL tree.
     * This rotation is performed when the balance factor of a node is less than -1,
     * indicating that the right subtree of the node is taller and causing imbalance.
     * The left rotation helps in rebalancing the tree by adjusting node positions.
     *
     * @param x The node around which the rotation is performed.
     * @return The new root node after the left rotation.
     */
    Node leftRotate(Node x) {
        // Store references to necessary nodes for rotation
        Node y = x.right; // y is the right child of x
        Node T2 = y.left; // T2 is the left child of y

        // Perform rotation: Adjust node positions
        y.left = x; // Make x the left child of y
        x.right = T2; // Make T2 the right child of x (which was the left child of y)

        // Update heights of the affected nodes after rotation
        x.height = max(height(x.left), height(x.right)) + 1; // Update height of x
        y.height = max(height(y.left), height(y.right)) + 1; // Update height of y

        return y; // Return the new root node after the rotation
    }


    /**
     * Calculates the balance factor of a given node in the AVL tree.
     * The balance factor is the difference between the heights of the left and right subtrees.
     *
     * @param N The node for which the balance factor is calculated.
     * @return The balance factor of the node.
     */
    int getBalance(Node N) {
        if (N == null)
            return 0; // Return 0 if the node is null (height difference is 0)

        // Calculate the height of the left and right subtrees
        int leftHeight = (N.left != null) ? N.left.height : 0;
        int rightHeight = (N.right != null) ? N.right.height : 0;

        // Calculate the balance factor by subtracting the heights of the subtrees
        return leftHeight - rightHeight;
    }


    /**
     * Inserts a node with a given key into the AVL tree and ensures that the tree remains balanced.
     *
     * @param node The current node being considered during insertion.
     * @param key  The key value of the node being inserted.
     * @return The root of the updated AVL tree after insertion and rebalancing.
     */
    Node insert(Node node, int key) {
        if (node == null)
            return (new Node(key));

        // Perform normal BST insertion
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        // Update height of this ancestor node
        node.height = 1 + max(height(node.left), height(node.right));

        // Get the balance factor of this ancestor node
        int balance = getBalance(node);

        // Perform rotations if needed to balance the tree

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // Return the unchanged node pointer
    }

    // Method to perform pre-order traversal of the AVL tree
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " "); // Print the key of the node
            preOrder(node.left); // Traverse left subtree
            preOrder(node.right); // Traverse right subtree
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Insert elements into the AVL tree for testing
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        // Display the constructed AVL tree using pre-order traversal
        System.out.println("Preorder traversal of constructed AVL tree is:");
        tree.preOrder(tree.root);
    }
}
