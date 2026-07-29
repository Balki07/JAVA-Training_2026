import java.util.*;
public class UserInputObjectCreation {
    int id;
    String name;
    void display(){
        System.out.println("NAME : "+name);
        System.out.println("ID : "+id);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of objects : ");
        int n = s.nextInt();
        UserInputObjectCreation students[] = new UserInputObjectCreation[n];
        for(int i=0;i<n;i++){
            students[i] = new UserInputObjectCreation();
            System.out.print("Enter the Student ID : ");
            students[i].id = s.nextInt();
            s.nextLine(); // Consume the newline character
            System.out.print("Enter the Student Name : ");
            students[i].name = s.nextLine();
        }
        for(int i=0;i<n;i++){
            students[i].display();
        }
    }
}
