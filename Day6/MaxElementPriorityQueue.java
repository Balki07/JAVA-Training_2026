import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class MaxElementPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        System.out.println("Maximum Element: " + pq.peek());
        sc.close();
    }
}