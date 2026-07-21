import java.util.*;
class StringFundamentals{
    public static void main(String[] args) {
        String S1="bala";
        String S2="ganesh";
        String S3="Hulk Hogan";
        String S4="rbalaganesh@gmail.com";
        String S6="ganesh115@gmail.";
        String[] S5=S4.split("a");
        System.out.println("Length of S1 is "+S1.length());
        System.out.println("Character at index 2 of S1 is "+S1.charAt(2));
        System.out.println("Are S1 and S2 equal? "+S1.equals(S2));
        System.out.println("Concatenation of S1 and S2 is "+S1.concat(S2));
        System.out.println("The Uppercase of S1 is "+S1.toUpperCase());
        System.out.println("The Lowercase of S1 is "+S1.toLowerCase());
        System.out.println("Are S1 and S2 equal (ignoring case)? "+S1.equalsIgnoreCase(S2));
        System.out.println("Substring of S1 is :"+S1.substring(0,4));
        System.out.println("Comparison of S1 and S2: "+S1.compareTo(S2));
        System.out.println("The Trimmed version of S3 is :"+S3.trim());
        System.out.println("The Split of S4 is :"+Arrays.toString(S5));
        System.out.println("Does S4 contain '.com'? "+S4.contains(".com"));
        System.out.println("Does S6 contain '.com'? "+S6.contains(".com"));
        System.out.println("Does S4 start with 'rbala'? "+S4.startsWith("rbala"));
        System.out.println("Does S4 end with 'gmail.com'? "+S4.endsWith("gmail.com"));
    }
}