package SB101_day6_assignment;

public class Even_thread {
    public static void main(String[] args) {
        A a1=new A();
        Thread a=new Thread(a1);
        B b1=new B();
        Thread b=new Thread(b1);
        a.start();
        b.start();
    }




}
class A implements Runnable{

    @Override
    public void run() {
        A b1=new A();
        Thread a= new Thread(b1);
        try {
            a.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class B implements  Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

