class vehicle{
    void drive(){
        System.out.println("I am driving");
    }
}
class car extends vehicle{
    void type(){
        System.out.println("Its a bmw m8");
    }
}
class Bmw extends car{
    void mode(){
        System.out.println("This is a sports edition");
    }
}
public class Inheritance{
    public static void main(String[] args) {
    Bmw b1=new Bmw ();
    b1.drive();
    b1.type();
    b1.mode();
    }
}