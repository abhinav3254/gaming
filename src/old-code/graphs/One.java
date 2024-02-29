package graphs;

import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class One {
		
	static int nodes;
	static LinkedList<Integer>[] adj;
	
	public One(int nodes) {
		this.nodes = nodes;
		this.adj = new LinkedList[nodes];
		
		for (int i = 0;i<nodes;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	} 
	
	
	public static void main(String[] args) {
		
		One graph = new One(6);
		
		graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
        
		
	}
	
	private static void addEdge(int src,int des) {
		adj[src].add(des);
	}
}
