package SB101_day4_assignment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class student_demo {
    public static void main(String[] args) {
        List<Student_bean> ls=new ArrayList<>();
        ls.add(new Student_bean(1,"Ajay","Delhi",55));
        ls.add(new Student_bean(5,"veer","banglore",89));
        ls.add(new Student_bean(8,"Ayush","mumbai",89));
        ls.add(new Student_bean(1,"Ajay","Delhi",55));
        ls.add(new Student_bean(6,"Shiva","manpuri",35));

        Stream<Student_bean>str=ls.stream();
        Optional<Student_bean>maximum=str.max((s1, s2)->{return s1.getMarks()>s2.getMarks() ? +1:-1;});
        System.out.println(maximum.get());
        System.out.println("--------------------**********************-----------------------");
        List<Integer>lis=new ArrayList<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        lis.add(6);

        Stream<Integer> str1=lis.stream();
        str1.map(s->{ Integer s1=s*s;
            return s1;}).forEach(x-> System.out.print(x+" "));
        System.out.println();

        System.out.println("---------------------**********************------------------------");

        Set<Student_bean>stud_set=new HashSet<>();
        ls.forEach(o1->{
            System.out.println(stud_set.add(o1));
        });



//        Stream<Student_bean>set_str= stud_set.stream();
//        Set<Student_bean>filtered=set_str.filter((s1)->{return s1.getMarks()>500;}).collect(Collectors.toSet());




    }
}
