package Day7;
import java.util.Scanner;
public class AdjacencyMatrix {
    int vertices;
    int [][] graph;
    AdjacencyMatrix(int v){
        vertices = v;
        graph = new int[v][v];
    }
    void addedge(int source,int destination){
        if(source >= 0 && source < vertices && destination >= 0 && destination < vertices){
            graph[source][destination] = 1;
            graph[destination][source] = 1;
        }
        else{
            System.out.println("Invalid edge!");
        }
    }
    public void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of vertices:");
        int n = sc.nextInt();
        AdjacencyMatrix graph = new AdjacencyMatrix(n);
        System.out.print("Enter the number of edges:");
        int e = sc.nextInt();
        for(int i=1;i<=e;i++){
            System.out.println("Edge : "+i);
            System.out.print("Enter the source vertex:");
            int source = sc.nextInt();
            System.out.print("Enter the destination vertex:");
            int destination = sc.nextInt();
            graph.addedge(source, destination);
            System.out.println("Graph after adding edge:");
            graph.printGraph();
        }
    }
}
