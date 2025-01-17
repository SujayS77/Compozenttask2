class pen{
    String colour;
    String type;

    public void printinfo(){
        System.out.println(this.colour);
        System.out.println(this.type);
    }
    pen (String colour,String type){
        this.colour=colour;
        this.type=type;
    }
}
public class Parameterised{
    public static void main(String[] args) {
        pen p1=new pen("Red","Gel");
        p1.printinfo();
        pen p2=new pen("Black","Ink");
        p2.printinfo();

    }
}