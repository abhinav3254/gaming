

import java.util.LinkedList;

@SuppressWarnings("unchecked")
class Graph1 {

    private LinkedList<Integer>[] list;
    private int vertices;

    public Graph1(int v) {
        this.vertices = v;
        list = (LinkedList<Integer>[]) new LinkedList[v]; // Suppress the warning
        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int des) {
        list[src].add(des);
    }

    public static void main(String[] args) {
        Graph1 graph = new Graph1(6);

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
}
