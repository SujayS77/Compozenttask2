import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int n, c=0 ,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check if it's an Armstrong Number:");
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {a=n%10;
        n=n/10;
        c=c+(a*a*a);
    } if(temp==c)
    {System.out.print("The number is a Armstrong number");
}else {System.out.print("The number is not a Armstrong number");
}
        }
    }
