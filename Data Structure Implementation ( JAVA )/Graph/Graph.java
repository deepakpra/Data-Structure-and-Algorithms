// Implementaion of Undirected, Unweighted Graph using Adjacency list


import java.util.*;

class MyGraph {
    private ArrayList<ArrayList<Integer>> adj;
    private boolean vis[];
    private int n; //Number of vertex
    MyGraph(int Vertex) {
        // Initialization of graph
        adj = new ArrayList<>(Vertex);
        n = Vertex;
        for (int i = 0; i < Vertex; i++)
            adj.add(new ArrayList<Integer>());

    }

    // Method to add edges of graph
    void addEdges(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Method for Depth First Search(DFS)
    void dfsUtill(int v) {
        vis[v] = true;
        System.out.print(v + " ");
        for (int child : adj.get(v)) {
            if (!vis[child])
                dfsUtill(child);
        }
    }

    // Method to call dfsUtill()
    void dfs(int v) {
        System.out.print("DFS: ");
        vis = new boolean[n];
        dfsUtill(v);
    }
    
    // Method for Breadth First Search(BFS)
    void bfs(int v) {
        System.out.print("BFS: ");
        vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        vis[v] = true;
        q.add(v);
        while (q.size() != 0) {
            int n = q.remove();
            System.out.print(n + " ");
            for (int child : adj.get(n)) {
                if (!vis[child]) {
                    vis[child] = true;
                    q.add(child);
                }
            }
        }
    }

}

public class Graph {
    public static void main(String[] args) {
        int V = 5; //Number of vertex
        MyGraph graph = new MyGraph(V);
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(1, 4);
        graph.addEdges(2, 3);
        graph.addEdges(3, 1);
        graph.addEdges(4, 2);
        graph.dfs(0);           /// Output=>  DFS: 0 1 4 2 3
        System.out.println();
        graph.bfs(0);          /// Output=>   BFS: 0 1 2 4 3
    }
}

