package SB101_day4_assignment;
import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<product_bean> ls=new ArrayList<>();
        ls.add(new product_bean(1,"Watch",210,750));
        ls.add(new product_bean(2,"Tv",5,890));
        ls.add(new product_bean(3,"iphone",150,1000));
        ls.add(new product_bean(8,"MacBook",9,157900));
        ls.add(new product_bean(9,"humanBot",482,98700));
        System.out.println(ls.toString());
        System.out.println("--------------------------Sorted Filtered List--------------------");

        Stream<product_bean>stream1=ls.stream();
        stream1.filter(s-> s.getQuantity()>10).sorted((s1,s2)->{return s1.getPrice()>s2.getPrice() ? -1:+1;}).forEach(s-> System.out.println(s.toString()));

    }
}
