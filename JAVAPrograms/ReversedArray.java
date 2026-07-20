import java.util.*;
class ReversedArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of elements : "); 
        int n = s.nextInt();  
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	System.out.println("Enter the value for index " + i);
            arr[i] = s.nextInt();
        }
        System.out.println("The Reversed order is ");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}