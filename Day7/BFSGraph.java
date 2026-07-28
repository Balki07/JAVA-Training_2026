package Day7;
import java.util.*;
public class BFSGraph{
    ArrayList<ArrayList<Integer>> graph;
    BFSGraph(int vertices){
        graph = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int source,int destination){
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    void BFS(int source){
        boolean visited[] = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            System.out.print(currentVertex+" ");
            for(int neighbor : graph.get(currentVertex)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of vertices:");
        int n = sc.nextInt();
        BFSGraph graph = new BFSGraph(n);
        System.out.print("Enter the number of edges:");
        int e = sc.nextInt();
        for(int i=1;i<=e;i++){
            System.out.println("Edge : "+i);
            System.out.print("Enter the source vertex:");
            int source = sc.nextInt();
            System.out.print("Enter the destination vertex:");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        System.out.print("Enter the source vertex for BFS traversal:");
        int sourceVertex = sc.nextInt();
        System.out.println("BFS Traversal starting from vertex "+sourceVertex+":");
        graph.BFS(sourceVertex);
    }
}