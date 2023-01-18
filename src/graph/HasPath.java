package graph;

import java.util.ArrayList;

public class HasPath {

    public static boolean find(int[][] edges,int source,int destination,int vertices)
    {
        ArrayList<Edge> graph[] =new ArrayList[vertices];
        boolean[] visited=new boolean[vertices];

        for(int i=0;i<vertices;i++)
        {
            graph[i]=new ArrayList();
        }

        for(int i=0;i<edges.length;i++)
        {
            int src = edges[i][0];
            int dest = edges[i][1];

            graph[src].add(new Edge(src,dest));
            graph[dest].add(new Edge(dest,src));
        }





     return hasPath(graph,source,destination,visited);
    }


    static boolean hasPath(ArrayList<Edge>[] graph,int source, int destination,boolean visited[])
    {
        if(source==destination)
            return true;

        visited[source]=true;
        for(Edge edge: graph[source])
        {
           if(!visited[edge.destination])
           {
               boolean res = hasPath(graph,edge.destination,destination,visited);
               if(res)
                   return true;
           }
        }
        return  false;
    }



    public static void main(String args[])
    {

        int vertices=6;
        int edges[][]={{0,1},{0,2},{3,5},{5,4},{4,3}};


        System.out.println(find(edges,0,5,vertices));
    }
}
