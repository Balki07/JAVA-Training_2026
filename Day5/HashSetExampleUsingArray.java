import java.util.*;
public class HashSetExampleUsingArray{
 public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    int[] arr={1,1,2,3,5,2,3,6,4};
    for(int i:arr){
        set.add(i);
    }
    for(int i:set){
        System.out.print(i + " ");
    } 
    }   
}
