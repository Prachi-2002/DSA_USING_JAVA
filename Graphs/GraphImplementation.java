package Graphs;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    int index;
    ArrayList<Node> adjacentNodes;

    Node(int index){
        this.index = index;
        this.adjacentNodes = new ArrayList<>();
    }

}

class Graph {

    ArrayList<Node> graph;
    int nVertex;

    Graph (){
        nVertex = 0;
        graph = new ArrayList<Node>();
    }

    void addVertex(){
        graph.add(new Node(graph.size()));
    }

    void addEdge (int source , int destination){

        Node sourceNode = graph.get(source);
        Node destinationNode = graph.get(destination);
        sourceNode.adjacentNodes.add(destinationNode);
        destinationNode.adjacentNodes.add(sourceNode);
    }

    void BFSTraversal () {

    }

    void DFSTraversal (int source) {

        boolean [] visited = new boolean [graph.size()];

        Stack<Node> st =  new Stack<>();

        st.push(this.graph.get(source));

        while(!st.isEmpty()){

            Node poopedNode = st.pop();
            
            if(visited[poopedNode.index] == false){
                System.out.print(poopedNode.index);
                visited[poopedNode.index] = true;
            }
        }
    }

    static boolean isCyclePresent(int source , Node parent){

        
        return false;
    } 


}

public class GraphImplementation {



    public static void main(String[] args) {
        
    }
    
}