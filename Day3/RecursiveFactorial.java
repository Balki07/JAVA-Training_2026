import java.util.Scanner;
static int RecursiveFactorial(int n) {
    if(n<1){
        return 1;
    }
    return n*RecursiveFactorial(n-1);
}
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the Factorial Count : ");
    int n=s.nextInt();
    int ans=RecursiveFactorial(n);
    System.out.println("The Answer is "+ans);
    s.close();
}
