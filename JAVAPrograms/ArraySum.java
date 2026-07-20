import java.util.*;
class ArraySum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int Sum=0;
        System.out.print("Enter the Number of elements : ");
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element of "+i);
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            Sum +=arr[i]; 
        }
        System.out.println("Sum is : "+Sum);
        System.out.println("Average is : "+(double)Sum/n);
    }
}