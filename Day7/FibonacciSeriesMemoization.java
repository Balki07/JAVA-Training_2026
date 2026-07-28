package Day7;
import java.util.Scanner;
import java.util.Arrays;
public class FibonacciSeriesMemoization{
    static int fib(int n,int dp[]){
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==0 || n==1){
            return dp[n]=n;
        }
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series : ");
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("The Value for the given n terms :"+fib(n,dp));
        sc.close();
    }
}