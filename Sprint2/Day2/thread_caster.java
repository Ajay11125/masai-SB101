package SB101_day5_assignment;

public class thread_caster {
    public static void main(String[] args) {
        A a1= new A();
        Thread a=new Thread(a1);
        a.setName("Dhoni");
        a.setPriority(8);
        B b1= new B();
        Thread b=new Thread(b1);
        b.setName("Kohli");
        b.setPriority(10);
        a.start();
        b.start();
    }
}
class A implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Priority of this thread is "+Thread.currentThread().getPriority()+" and Name is "+Thread.currentThread().getName());
        }
    }
}
class B implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Priority of this thread is "+Thread.currentThread().getPriority()+" and Name is "+Thread.currentThread().getName());
        }
    }
}
