package SB101_day1_assignment;

import java.util.Comparator;

public class empaddress implements Comparator<Emplyee_Bean> {

    @Override
    public int compare(Emplyee_Bean o1, Emplyee_Bean o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
