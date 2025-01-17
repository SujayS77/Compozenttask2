 class student {
        String name;
        String address;
        int age;
        int id;
public void printinfo(String name){
System.out.println(name);
        }
        public void printinfo(int id){
                System.out.println(id);
        }
        public void printinfo(String name , String address){
System.out.println(name);
System.out.println(id);
        } public void printinfo(String name , int id){
                System.out.println(name);
                System.out.println(id);
        }
        public void printinfo(int age , int id){
                System.out.println(age);
                System.out.println(id);
        } } 
public class method {
       public static void main(String[] args) {
        student s1=new student();
        s1.name="Sujay";
        s1.address="Mumbai";
        s1.id=1628;
        s1.age=19;
        s1.printinfo(s1.name);
        s1.printinfo(s1.id);
        s1.printinfo(s1.name,s1.address);
        s1.printinfo(s1.name,s1.id);
        s1.printinfo(s1.id,s1.age);
}}
