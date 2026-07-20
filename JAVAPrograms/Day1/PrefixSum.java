import java.util.*;
class PrefixSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        arr2[0] = arr1[0];
        for(int i=1;i<n;i++){
            arr2[i] = arr2[i-1] + arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
		System.out.println(arr2[i]);
    }
    sc.close();
    }
}