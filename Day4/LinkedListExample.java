import java.util.Scanner;
class LinkedListExample {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        System.out.println("First Element is deleted");
    }
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Last Element is deleted");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Last Element is deleted");
    }
    void search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }
    void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nLinked List");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete at Beginning");
            System.out.println("4. Delete at End");
            System.out.println("5. Display");
            System.out.println("6. Search");
            System.out.println("7. Exit");
            System.out.print("Enter your Choice: ");
            choice = s.nextInt();
            if (choice == 1) {
                System.out.print("Enter Value: ");
                int value = s.nextInt();
                list.insertAtBeginning(value);
            }
            else if (choice == 2) {
                System.out.print("Enter Value: ");
                int value = s.nextInt();
                list.insertAtEnd(value);
            }
            else if (choice == 3) {
                list.deleteAtBeginning();
            }
            else if (choice == 4) {
                list.deleteAtEnd();
            }
            else if (choice == 5) {
                list.display();
            }
            else if (choice == 6) {
                System.out.print("Enter Key: ");
                int key = s.nextInt();
                list.search(key);
            }
            else if (choice == 7) {
                System.out.println("Exiting");
            }
            else {
                System.out.println("Invalid Choice");
            }
        } while (choice != 7);
        s.close();
    }
}