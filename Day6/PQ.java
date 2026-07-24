import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;
class Main{
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq= new PriorityQueue<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }
        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}