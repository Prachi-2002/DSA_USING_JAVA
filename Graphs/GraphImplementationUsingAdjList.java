package Graphs;
import java.util.*;

class GraphStruc {
    int v ;
    int e ; 
    Map<Integer, List<Integer>> adjList;

    public GraphStruc(int v, int e) {
        this.v = v;
        this.e = e;
        adjList = new HashMap<>();
        for(int i=0;i<v;i++){
            adjList.put(i, new ArrayList<>());
        }
    }   

    public void addEdge(int u, int v , int direction){

        adjList.get(u).add(v);
        if(direction == 0){
            adjList.get(v).add(u);
        }
    }

    public void printAdjList(){
        // System.out.println(this.adjList.keySet());

        for(int entry: this.adjList.keySet()){
            // System.out.println(this.adjList.get(entry));
            for(int num: this.adjList.get(entry)){
                System.out.print(num +  " -> ");
            }
            System.out.println();
        }
    }


}


class GrapghUsingMatrix {
    int v;
    int e;

    int[][] adjMatrix;

    public GrapghUsingMatrix(int v, int e) {
        this.v = v;
        this.e = e;
        adjMatrix = new int[v][v];
    }

    public void addEdge(int u, int v, int direction){
        this.adjMatrix[u][v] = 1;
        if(direction == 0){
            this.adjMatrix[v][u] = 1;
        }
    }

    public void printGraph(){
        for(int i=0;i< this.v;i++){
            for(int j=0;j<e;j++){
                System.out.print(this.adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class GraphImplementationUsingAdjList {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        // List<List<Integer>> arr = new ArrayList<>();
        GraphStruc graph = new GraphStruc(n, m);
        GrapghUsingMatrix graph1 = new GrapghUsingMatrix(n, m);

        for(int i=0;i<m ;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge( u, v, 0);
            graph1.addEdge( u, v, 1);

        }
        graph.printAdjList();
        graph1.printGraph();
        // System.out.println(graph.adjList);





































        
    }
}