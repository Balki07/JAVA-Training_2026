import java.util.*;
public class MinimumElement{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of elements : "); 
        int n = s.nextInt();  
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	System.out.println("Enter the value for index " + i);
            arr[i] = s.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
        	if(arr[i]<min){
        		min=arr[i];
        	}
        }
        System.out.println("The Minimum Element is : " + min);
        s.close();
    }
}