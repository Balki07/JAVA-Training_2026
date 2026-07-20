import java.util.Scanner;
class ArrInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the value for index " + i);
			arr[i] = sc.nextInt();
		}
		for(int i: arr){
			System.out.println(i);
		}	
	}
}