import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        System.out.print("Enter the number of elements to be displayed : ");
        int m = sc.nextInt();
        if (m > n || m <= 0) {
            System.out.println("Invalid m");
        } else {
            System.out.println("First " + m + " elements are:");
            for (int i = 0; i < m; i++) {
                System.out.print(pq.poll() + " ");
            }
        }
        sc.close();
    }
}