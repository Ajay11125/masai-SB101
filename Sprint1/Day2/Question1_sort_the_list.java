package SB101_Day2_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question1_sort_the_list {
    public static void main(String[] args) {
        List<String>ls= new ArrayList<>();
        ls.add("Delhi");
        ls.add("Banglore");
        ls.add("Mumbai");
        ls.add("Bhopal");
        ls.add("haryana");
        ls.sort((s1,s2)->{
            return s1.compareTo(s2);
        });
        System.out.println(ls);


    }
}
