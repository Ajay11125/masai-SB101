package SB101_Day2_assignment;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<product_bean> ls=new ArrayList<>();
        ls.add(new product_bean(1,"Watch",210,750));
        ls.add(new product_bean(2,"Tv",560,890));
        ls.add(new product_bean(3,"iphone",150,1000));
        ls.add(new product_bean(8,"MacBook",50,157900));
        ls.add(new product_bean(9,"humanBot",482,98700));
        ls.sort((product_bean s1,product_bean s2)->{
            if(s1.getPrice()>s2.getPrice()){
                return -1;
            } else if (s1.getPrice()<s2.getPrice()) {
                return +1;
            }
            else{
                return 0;
            }
        });
        System.out.println(ls);
    }
}
