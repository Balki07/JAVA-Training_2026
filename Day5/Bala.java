public class Bala{
    int a= 10;
    int Addition(){
        int add = a+5;
        return add;
    }
    int Subtraction(){
        int sub = a-10;
        return sub;
    }
    int Product(){
        int product = a*5;
        return product;
    }
    public static void main(String[] args){
        Bala ba=new Bala();
        System.out.println(ba.Addition());
        System.out.println(ba.Subtraction());
        System.out.println(ba.Addition());
    }
}