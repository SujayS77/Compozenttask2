import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int n, i, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check whether it is a prime number or not:");
        n = sc.nextInt();
        if (n <= 1) {
            System.out.println("The entered number is not a prime number.");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("The entered number is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The number is a prime number.");
            }
        }
    }
}
