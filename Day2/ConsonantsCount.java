import java.util.*;
class ConsonantsCount{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string : ");
    String s=sc.nextLine();
    String S1=s.toLowerCase();
    int ccount=0;
    for(int i=0;i<S1.length();i++){
        char ch=S1.charAt(i);
        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!=' '){
            ccount++;
        }
    }
    System.out.println("The Number of Consonants is : "+ccount);
    }
}
