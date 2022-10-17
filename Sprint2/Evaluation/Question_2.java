package Week2_Evaluation;

public class Question_2 {
    public static void main(String[] args) {
            demo a1=new demo();
            Thread a=new Thread(a1);
            a.start();
            System.out.println(a1.prod);

    }
}
class demo implements Runnable{
int prod=1;

    @Override
    public void run() {
        for (int i=1;i<11;i++){
            prod*=i;
        }
    }
}
