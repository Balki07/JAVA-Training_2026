import java.util.*;
public class HashMapMenu {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        public void insertValue(){
            System.out.print("Enter the Number of Elements :");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.print("Enter the Key : ");
                int key = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Value : ");
                String val = sc.next();
                map.put(key, val);
            }
        }
        public void display(){
            if(map.isEmpty()){
                System.out.println("The Hashmap is Empty");
            }
            else{
                for(Map.Entry<Integer, String> entry: map.entrySet()){
                System.out.println(entry.getKey() + " => " + entry.getValue());
                }
            }
        } 
    public static void main(String[] args) {

        HashMapMenu hm = new HashMapMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Driven Hashmap");
        while(true){
        System.out.println("1. Insert");
        System.out.println("2. Display");
        System.out.println("3. Exit");
        System.out.print("Enter the Choice :");
        int choice = hm.sc.nextInt();
        switch(choice){
            case 1:
                hm.insertValue();
                break;
            case 2:
                hm.display();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        if (choice == 3){
            break;
        }
        sc.close();
    }
}
}
