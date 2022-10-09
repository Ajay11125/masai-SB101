package SB101_day1_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    public static void main(String[] args) {
        List<Student_bean>ls=new ArrayList<>();
        ls.add(new Student_bean(1,"Ajay","Delhi",55));
        ls.add(new Student_bean(5,"veer","banglore",89));
        ls.add(new Student_bean(8,"Ayush","mumbai",89));
        ls.add(new Student_bean(1,"Ajay","Delhi",55));
        ls.add(new Student_bean(6,"Shiva","manpuri",35));
        Set<Student_bean>st=new HashSet<>(ls);
        ls=new ArrayList<>(st);


        studentMarkscomp marksort=new studentMarkscomp();
        ls.sort(marksort);
        System.out.println("------------*-******--*---------");
        System.out.println(ls);
    }

}
