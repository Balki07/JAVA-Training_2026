import java.util.*;
class GreedyExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int coins[]={1,1,5,10,20,100000};
        int amount = sc.nextInt();
        int count = 0;
        for(int coin : coins){
            while(amount>=coin){
                System.out.println(coin +" ");
                amount-=coin;
                count++;
            }
        }
    }
}