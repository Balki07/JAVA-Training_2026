import java.util.*;
class OddEvenArraySum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        System.out.print("Enter the Number of elements : "); 
        int n = s.nextInt();  
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	System.out.println("Enter the value for index " + i);
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenSum++;
            }
            else{
                oddSum++;
            }
        }
        System.out.println("Count of Even Count :"+evenSum);
        System.out.println("Count of Odd Count :"+oddSum);
    }
}