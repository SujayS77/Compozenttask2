    class Even extends Thread {
    public void run (){
            for(int i=0;i<=10;i+=2){
                System.out.println("The Even numbers are as follows "+i);
            }
        }
    }
    class Odd extends Thread{
        public void run (){
            for(int i=1;i<=10;i+=2){
                System.out.println("The Odd numbers are as follows "+i);
            }
        }
    }
    public class Threads{
        public static void main(String[] args) {
            Thread t1 = new Even();
            Thread t2 = new Odd();
            t1.start();
            t2.start();
        }
    }