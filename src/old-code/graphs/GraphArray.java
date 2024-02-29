import java.util.*;


class Main {
	public static void main(String[] args) {

		// v is nodes
		int v = 5;
		// e is edges
		int e = 10;

		int[][] a = new int[v+1][v+1];



	}

	private static void addEdge(int src,int des) {
		a[src][des] = 1;
		a[des][src] = 1;
	}
}