import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int numVertices;
    ArrayList<Integer>[] adjLists;
    boolean[] visited;

    Graph(int vertices) {
        numVertices = vertices;
        adjLists = new ArrayList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src);
    }

    void BFS(int startVertex) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(startVertex);
        visited[startVertex] = true;

        while (!q.isEmpty()) {
            int front = q.poll();
            System.out.print(front + " ");

            for (int i : adjLists[front]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.print("BFS from vertex 0: ");
        g.BFS(0);
    }
}
