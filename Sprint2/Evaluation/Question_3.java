package Week2_Evaluation;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_3 {
    public static void main(String[] args) {
        ExecutorService excuter= Executors.newFixedThreadPool(3);
        Callable<Integer>call=new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        };

    }
}
