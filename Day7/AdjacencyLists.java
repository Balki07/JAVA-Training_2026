package Day7;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyLists {
    int vertices;
    ArrayList<ArrayList<Integer>> adjList;
    AdjacencyLists(int v) {
        vertices = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addedge(int source, int destination) {
            adjList.get(source).add(destination);
            adjList.get(destination).add(source);
        }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of vertices:");
        int n = sc.nextInt();
        AdjacencyLists graph = new AdjacencyLists(n);
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