
import java.util.Scanner;

public class TwoPointersMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S=sc.nextLine();
        char[] ch=S.toCharArray();
        int start = 0;
        int end = ch.length-1; 
        while(start<end){   
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(ch);
        System.out.println(reversed);
    }
}
