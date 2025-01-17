import java.util.*;
class Info{
    String id;
    String name;
    String address;
    String salary;
    String doj;

Info(String id,String name,String address,String salary,String doj){
    this.id=id;
    this.name=name;
    this.address=address;
    this.salary=salary;
    this.doj=doj;
}
public void printinfo(){
    
    System.out.println(this.id);
    System.out.println(this.name);
    System.out.println(this.address);
    System.out.println(this.salary);
    System.out.println(this.doj);
}
}
public class Employee{
    public static void main(String[] args) {
        Info e1=new Info("Enter","Enter","Enter","Enter","Enter");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id of employee 1");
        e1.id=sc.nextLine();
        System.out.println("Enter the name of employee 1");
        e1.id=sc.nextLine();
        System.out.println("Enter the address of employee 1");
        e1.id=sc.nextLine();
        System.out.println("Enter the salary of employee 1");
        e1.id=sc.nextLine();
        System.out.println("Enter the date of birth of employee 1");
        e1.id=sc.nextLine();
        Info e2=new Info("Enter","Enter","Enter","Enter","Enter");
        System.out.println("Enter employee id of employee 2");
        e2.id=sc.nextLine();
        System.out.println("Enter the name of employee 2");
        e2.id=sc.nextLine();
        System.out.println("Enter the address of employee 2");
        e2.id=sc.nextLine();
        System.out.println("Enter the salary of employee 2");
        e2.id=sc.nextLine();
        System.out.println("Enter the date of birth of employee 2");
        e2.id=sc.nextLine();


    }
}
