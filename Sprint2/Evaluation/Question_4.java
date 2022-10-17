package Week2_Evaluation;

public class Question_4 {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        Thread a=new Thread(a1);
        Thread b=new Thread(b1);
        Thread c=new Thread(c1);
        a.setName("Kholi");
        a.setPriority(1);
        b.setName("Dhoni");
        b.setPriority(10);
        c.setName("Rohit");
        c.setPriority(5);
        b.start();
        c.start();
        a.start();

    }
}
class A implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Number from thread 1 "+i);
        }
    }
}
class B implements Runnable{
    @Override
    public void run() {
        int sum=0;
        for(int i=0;i<=20;i++){
            sum+=i;
        }
        System.out.println("Sum from thread 2 "+sum);
    }
}
class C implements Runnable{
    @Override
    public void run() {
        int prod=1;
        for(int i=1;i<=10;i++){
            prod*=i;
        }
        System.out.println("prod from thread 3 "+prod);
    }
}
