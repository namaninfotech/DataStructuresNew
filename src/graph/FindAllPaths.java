package graph;
//Bidirectional graph [s->d,d->s]
 import java.util.ArrayList;

public class FindAllPaths {

    static int count=0;
    static int find(int[][] edges, int source, int destination, int vertices) {

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList();
        }

        for (int i = 0; i < edges.length; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];

            graph[src].add(new Edge(src, dest));
            graph[dest].add(new Edge(dest, src));
        }
        allPaths(graph, source, destination, visited,"");
        return count;

    }

    static void allPaths(ArrayList<Edge>[] graph, int source, int destination,  boolean[] visited, String psf) {
        if (source == destination) {
            System.out.println(psf);
            count++;
            return;

        }

        visited[source] = true;
        for (Edge edge : graph[source]) {
            if (!visited[edge.destination]) {
                allPaths(graph, edge.destination, destination, visited,psf+edge.destination);
            }
        }
        visited[source] = false;

    }

    public static void main(String args[]) {
        int[][] graph = {{0, 1}, {0, 2}, {0, 3}, {1, 3}, {1, 4}, {2, 4}, {2, 5}};

        System.out.println(find(graph, 0, 5, 6));
    }
}
