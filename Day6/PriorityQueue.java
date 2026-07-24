import java.util.*;
public class PriorityQueue {
    Scanner sc = new Scanner(System.in);
    int size = 0;
    int[] arr;
    // Insert
    public void insert() {
        if (size == arr.length) {
            System.out.println("Priority Queue is Full");
            return;
        }
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        int i;
        for (i = size - 1; i >= 0 && arr[i] > value; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = value;
        size++;
        System.out.println("Element Inserted Successfully.");
    }

    // Display
    public void display() {
        if (size == 0) {
            System.out.println("Priority Queue is Empty");
            return;
        }
        System.out.println("Elements are:");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    // Peek
    public void peek() {
        if (size == 0) {
            System.out.println("Priority Queue is Empty");
        } else {
            System.out.println("Peek Element: " + arr[0]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue();
        System.out.print("Enter the size of the Priority Queue: ");
        int n = sc.nextInt();
        pq.arr = new int[n];
        int choice;

        do {
            System.out.println("\n----- Priority Queue Menu -----");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pq.insert();
                    break;
                case 2:
                    pq.display();
                    break;
                case 3:
                    pq.peek();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}