public class Student {
    int id;
    String name;
    void display(){
        System.out.println("NAME : "+name);
        System.out.println("ID : "+id);
    }
    public static void main(String[] args) {
        Student st1=new Student();
        st1.name = "Bala";
        st1.id = 111;
        Student st2=new Student();
        st2.name = "Ganesh";
        st2.id = 121;
        st1.display();
        st2.display();
    }
}
