class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) { this.data = data; }
    }

    static Node insert(Node node,int data) {

        if (node == null) { return new Node(data); }
        else if (data<node.data) { node.left = insert(node.left,data); }
        else if (data>node.data) { node.right = insert(node.right,data); }
        return node;
    }

    static void display(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Node root = null;

        int[] valuesToInsert = {50, 30, 70, 20, 40, 60, 80};
        for (int value : valuesToInsert) {
            root = insert(root, value);
        }

        System.out.println("Binary Search Tree:");
        display(root);
    }


}
