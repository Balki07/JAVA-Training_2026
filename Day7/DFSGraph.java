package Day7;
import java.util.*;
public class DFSGraph {
    ArrayList<ArrayList<Integer>> graph;
    boolean visited;
    DFSGraph(int vertices){
        graph = new ArrayList<>();
        visited = new boolean[vertices];
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
    }
    
    void dfs(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for(int neighbour:graph.get(vertex)){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of vertices:");
        int n = sc.nextInt();
        DFSGraph graph = new DFSGraph(n);
        System.out.print("Enter the number of edges:");
        int e = sc.nextInt();
        for(int i=1;i<=e;i++){
            System.out.println("Edge : "+i);
            System.out.print("Enter the source vertex:");
            int source = sc.nextInt();
            System.out.print("Enter the destination vertex:");
            int destination = sc.nextInt();
            graph.graph.get(source).add(destination);
            graph.graph.get(destination).add(source);
        }
        System.out.print("Enter the starting vertex for DFS traversal:");
        int startVertex = sc.nextInt();
        System.out.println("DFS Traversal starting from vertex "+startVertex+":");
        graph.dfs(startVertex);
        
    }        
}

