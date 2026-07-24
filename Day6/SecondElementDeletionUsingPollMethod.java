import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
class SecondElementDeletionUsingPollMethod{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }
        pq.poll();
        System.out.println("The SEcond largest element is : "+pq.peek());
        }
}