package Week1_Evaluation;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Product_bean>ls=new ArrayList<>();
        ls.add(new Product_bean(1,"Pen",5,1));
        ls.add(new Product_bean(2,"Pencil",10,150));
        ls.add(new Product_bean(3,"Rubber",7,500));
        ls.add(new Product_bean(6,"Sharpner",12,610));
        ls.add(new Product_bean(5,"Scale",18,175));
        ls.add(new Product_bean(8,"Compass",185,541));
        /* filter quantity less than 2 */
        ls.forEach(l->{
            if(l.getQunatity()<2){
                System.out.println(l);
            }
        });
        /*Sort the list*/
        ls.sort((Product_bean s1,Product_bean s2)->{
            if(s1.getPrice()>s2.getPrice()){
                return -1;
            }
            if(s1.getPrice()<s2.getPrice()){
                return +1;
            }
            else{
                return 0;
            }
        });
        System.out.println(ls);
        /*method refrence print list*/
        ls.forEach(System.out::println);

    }

}
