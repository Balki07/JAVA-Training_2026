import java.util.PriorityQueue;
import java.util.Scanner;
public class SearchElementPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        if (pq.contains(key)) {
            System.out.println("Element found in the Priority Queue.");
        } else {
            System.out.println("Element not found in the Priority Queue.");
        }
        sc.close();
    }
}