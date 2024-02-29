
class Main {

	/*
	 *
	 * Creating a node class to store elements
	 * Node class will have a data
	 * left will be pointing to left sub tree
	 * and right will be pointing to right sub tree
	 **/
	static class Node {
		int data;
		Node left;
		Node right;
		int height;

		public Node(int data) {
			this.data = data;
			this.height = 1;
		}
	}

	// public static Node insert(Node node ,int data) {
	// if (node == null) { return new Node(data); }

	// if (data<node.data) {
	// // left insert
	// node.left = insert(node.left,data);
	// } else if (data>node.data) {
	// // right insert
	// node.right = insert(node.right,data);
	// } else { return node; } // duplicate entry, not allowed

	// // now data is inserted, it's time to calculate the k value
	// // k value means height(leftsubtree)-height(rightsubtree)
	// }
}