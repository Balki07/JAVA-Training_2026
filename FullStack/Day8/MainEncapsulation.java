class Employee{
    private int salary;
    void setSalary(int salary){
        this.salary = salary;
    }
    int getSalary(){
        return salary;
    }
}
public class MainEncapsulation{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
