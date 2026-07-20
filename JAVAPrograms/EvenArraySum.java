import java.util.*;
class EvenArraySum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int Sum=0;
        System.out.print("Enter the Number of elements : ");
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	System.out.println("Enter the value for index " + i);
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++){ 
            if(arr[i]%2==0){
                Sum += arr[i];
            }
        }
        System.out.println("Sum of even elements is : "+Sum);

    }
}