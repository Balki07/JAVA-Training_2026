import java.util.Scanner;
static int SumOfElements(int n) {
    if(n<0){
        return 1;
    }
    return n+SumOfElements(n-1);
}
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the Number of Elements : ");
    int n=s.nextInt();
    int ans=SumOfElements(n);
    System.out.println("The Answer is "+ans);
    s.close();
}
