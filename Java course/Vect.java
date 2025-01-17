import java.util.*;
public class Vect {
    public static void main(String[] args) {
        Vector <String> list= new Vector <String>();
        list.addElement("Sujay");
        list.addElement("Muzzamil");
        list.addElement("Trevor");
        list.addElement("Michael");
        list.addElement("Lester");
        list.addElement("Franklin");
        System.out.println("Vector list"+list);
        System.out.println("Size of vector: "+list.size());
        System.out.println("Default capacity: "+list.capacity());
        System.out.println("Enter the name need to find in the list");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        if(list.contains(name)){
            System.out.println(name+ "is present in the list " + list.indexOf(name));
        }
    else{
        System.out.println(name+" is the present in the list "+ list.indexOf(name));
    }
    System.out.println("The first element of the vector is:"+ list.firstElement());
    System.out.println("The last element of the vector is:"+ list.lastElement());
    
    list.insertElementAt("Kat",2);
    System.out.println("Updated vector list" + list);

    System.out.println("Original vector list" + list);
    System.out.println("Cloned vector list" + list.clone());
    }
}