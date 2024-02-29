import java.util.*;

class Main {

	public static void main(String[] args) {

		int v = 5;
		int e = 10;

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0;i<=v;i++) {
			adj.add(new ArrayList<>());
		}

	}

	private static void addEdge(int src,int des) {
		adj.get(src).add(des);
		adj.get(des).add(src);
	}

}