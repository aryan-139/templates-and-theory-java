import java.util.*;

class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adjacencyList; // array of LinkedLists

    // Constructor
    public Graph(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    // Print the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Integer neighbor : adjacencyList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5); // Create a graph with 5 vertices

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        graph.printGraph();
    }
}

