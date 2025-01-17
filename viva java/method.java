class Student{
    String name;
    int id;
    String address;
    int age;

void printinfo(String name){
    System.out.println(name);
}
void printinfo(int id){
    System.out.println(id);
}
void printinfo(int id , String name){
    System.out.println(id);
    System.out.println(name);
}
void printinfo(int id , int age){
    System.out.println(id);
    System.out.println(age);
}
}
public class method{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sujay";
        s1.id=61;
        s1.address="Mumbai";
        s1.age=19;

        s1.printinfo(s1.name);
        s1.printinfo(s1.id);
        s1.printinfo(s1.id,s1.name);
        s1.printinfo(s1.id,s1.age);
    }
}