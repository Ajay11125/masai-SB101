package SB101_day1_assignment;

import java.util.Comparator;

public class studentMarkscomp implements Comparator<Student_bean> {
    @Override
    public int compare(Student_bean o1, Student_bean o2) {
        if(o1.getMarks()>o2.getMarks()){
            return -1;
        } else if (o2.getMarks()>o1.getMarks()){
            return +1;
        }
        else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}
