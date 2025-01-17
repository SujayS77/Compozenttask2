import java.util.Scanner;
class arithematic{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter a number to check whether it is a prime number or not: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<2){
            isPrime = false;
        } else {
            for(int i=2;i<n;i++){
            if(n%i==0){
            isPrime = false;
            break;
            }   
            }
        }
        if(isPrime){
            System.out.println(+ n +" is a prime number");
        } else {
            System.out.println(+ n +" is not a prime number");
        } sc.close();
    } 
    }
