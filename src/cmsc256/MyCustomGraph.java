package cmsc256;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyCustomGraph<V> extends UnweightedGraph<V> {

    public MyCustomGraph(){
        super();
    }

    public MyCustomGraph(int[][] edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    public MyCustomGraph(List<Edge> edges, int numberOfVertices) {  // use this one for read file
        super(edges, numberOfVertices);
    }

    public MyCustomGraph(List<V> vertices, List<Edge> edges) {
        super(vertices, edges);
    }

    public MyCustomGraph(V[] vertices, int[][] edges) {
        super(vertices, edges);
    }


    
    public MyCustomGraph<V> readFile(String fileName) throws FileNotFoundException {

        Scanner read = new Scanner(new File(fileName));
       // int [][] array = new int[100][100];

        int numVertices = Integer.parseInt(read.next());

        while(read.hasNextLine()){
            String line = read.nextLine();
        }

//        MyCustomGraph test = new MyCustomGraph();
//        return test;
        //return MyCustomGraph();

        MyCustomGraph test = new MyCustomGraph();
        return test;
    }

    public boolean isComplete(){
        int numVertices = this.getSize();
        int numEdges = 0;
        for(List<Edge> edgeList : neighbors)
            numEdges += edgeList.size();
        return numVertices * (numVertices -1) == numEdges;
    }


    public boolean areAdjacent(V v1, V v2){

        return false;
    }

    public boolean isConnected(){
        if(vertices.size() == 1){
            return false;
        }

        boolean[] visited = new boolean[vertices.size()];

        boolean isConnected = false;
        for(int i = 0; i < this.vertices.size(); i++){
            if(!visited[i]){
                if(isConnected){
                    return false;
                }
                else {
                    this.dfs(i);
                    isConnected = true;
                }
            }
        }
        return isConnected;
    }

    public List<V> getShortestPath(V begin, V end){
        ArrayList<V> test = new ArrayList<>();
        //return test;
        return null;

        // do bfs?
    }

    public boolean hasCycle(){
        if(this.getSize() == 0){
            return false;
        }
        else {
//            dfs(this.getSize());
//            return hasCycle();
            return true;
        }
    }

}
