import java.util.HashMap;
public class HashmapExample {
    public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1,"Sivaji");
    map.put(2,"M.G.R");
    map.put(3,"Bala");
    map.put(4,"Vijay");
    map.put(5,"Ajith");
    map.put(6,"Suriya");
    System.out.println(map.get(1));
    System.out.println(map);
    map.remove(2);
    System.out.println(map.get(2));
    System.out.println(map.containsKey(2));
    System.out.println(map.containsValue("Bala"));
    System.out.println(map.size());
    //map.clear();
    //map.remove(1);
    System.out.println(map.isEmpty());
    System.out.println(map);
    for(Integer key: map.keySet()){
        System.out.println(key+" => "+map.get(key));
    }
    System.out.println(map.get(3));
    }
}