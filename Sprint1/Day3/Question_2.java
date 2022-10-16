package SB101_day3_assignment;
import java.util.*;
import java.util.function.*;

public class Question_2 {
        public static void main(String[] args)
        {
            // Creating predicate
            Predicate<Integer> lesserthan = i -> (i < 18);

            // Calling Predicate method
            System.out.println(lesserthan.test(10));

            // This function returns a random value.
            Supplier<Double> randomValue = () -> Math.random();

            // Print the random value using get()
            System.out.println(randomValue.get());

            //multipy 2 using consumer
            Consumer<List<Integer> > modify = list ->{
                for (int i = 0; i < list.size(); i++)
                    list.set(i, 2 * list.get(i));
            };
            Consumer<List<Integer>>
                    dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

            List<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(1);
            list.add(3);

            interface Square {
                int calculate(int x);
            }
        }
    }

