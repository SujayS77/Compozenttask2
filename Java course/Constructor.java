class Pen{
    String colour;
    String type;

    public void printinfo(){
        System.out.println(this.colour);
        System.out.println(this.type);
    }
    Pen(){
        System.out.println("Default constructor is created ");
    }
}
 public class Constructor{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.colour="red";
        p1.type="marker";
        p1.printinfo();
        Pen p2=new Pen();
        p2.colour="black";
        p2.type="gel";
        p2.printinfo();
    }
 }