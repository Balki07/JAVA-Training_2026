import java.util.*;
public class Index{
    public static void main(String[] args){
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] arr={1,2,2,3,3,3,4,4,4,4};
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}