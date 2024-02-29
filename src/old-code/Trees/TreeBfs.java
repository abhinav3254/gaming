import java.util.Scanner;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Node root = null;
		root = insert(root,40);
		root = insert(root,20);
		root = insert(root,50);
		root = insert(root,15);
		root = insert(root,21);
		root = insert(root,45);
		root = insert(root,55);
		
		//print(root);
		bfs(root);
	}
	
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}

		if (data < root.data) {
			// left side insert it
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			// right side insert it
			root.right = insert(root.right, data);
		} else {
			// same value return it
			return root;
		}

		return root;
	}

	
	public static void print(Node root) {
		if (root == null) return;
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	
	public static void bfs(Node root) {
		if (root == null) return;
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.data+" ");
			if (node.left != null) queue.add(node.left);
			if (node.right !=null ) queue.add(node.right);
		}
	}
	
}
