package SB101_day1_assignment;

import java.util.Comparator;
public class emp_Salary implements Comparator<Emplyee_Bean>{

    @Override
    public int compare(Emplyee_Bean o1, Emplyee_Bean o2) {
        if(o1.getSalary()>o2.getSalary()){
            return +1;
        } else if (o2.getSalary()>o1.getSalary()){
            return -1;
        }
        else{
            return o1.getEmpName().compareTo(o2.getEmpName());
        }
    }
}
