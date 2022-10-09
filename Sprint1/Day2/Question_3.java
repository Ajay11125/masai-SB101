package SB101_Day2_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_3 {
    public static void main(String[] args) {
        PrintList i=list->{
            System.out.println(list);
        };
        List<String>ls=Arrays.asList("Delhi","mumbai","nmh","bhopal","astrakhan");
        List<String>city= new ArrayList<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Haryana");
        i.display(ls);
    }
}
