package Graphs;
import java.util.*;

public class BasicGraph {
    int v;
    List<List<Integer>> adj;

    BasicGraph (int v){
        this.v =v;
        this.adj = new ArrayList<>();
        for(int i=0;i<v ;i++){
            adj.add(new ArrayList<>());
        }
    }
}
