//write a array in try block and pass input and println the arrayout of bound exception
import java.util.*;
class ArrayoutOfBoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str= scanner.next();
        //int age = scanner.nextInt();
        //System.out.println("You entered: " + age);
        //System.out.print("Enter the number of elements : ");
        //int n = scanner.nextInt();
        //int[] array = new int[n]; // Array of size 5
        //for(int i = 0; i < n; i++) {
            //array[i] = scanner.nextInt(); // Initialize array elements
        //}
        try {
            //String str = null;
            //System.out.println(str.length());
            int age = scanner.nextInt();
            System.out.println("You entered: " + age);

            //int [] array = {1,2,3,4,5};
            //System.out.println(array[6]);
        } catch (Exception e) {
            //System.out.println("ArrayIndexOutOfBoundsException: You tried to access an index that is out of bounds.");
            System.out.println(e);
        }
    }
}
