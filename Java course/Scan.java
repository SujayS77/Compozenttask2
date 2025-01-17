import java.util.*;
public class Scan {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("To study the implementation of scanner class");
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The answer of a + b is "+c);
    }
}
