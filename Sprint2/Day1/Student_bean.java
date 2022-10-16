package SB101_day4_assignment;

import java.util.Objects;

public class Student_bean {
    private int roll;
    private String Name;
    private String Address;
    private int marks;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student_bean(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.Name = name;
        this.Address = address;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student_bean{" +
                "roll=" + roll +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", marks=" + marks +
                '}'+'\n';
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, Name, Address, marks);
    }

    @Override
    public boolean equals(Object obj) {
        SB101_day1_assignment.Student_bean s1=(SB101_day1_assignment.Student_bean) obj;
        if(this.getRoll()==s1.getRoll()&&this.getAddress().equals(s1.getAddress())&&this.getMarks()==s1.getMarks()&&this.getName().equals(s1.getName())){
            return true;
        }
        else{
            return false;
        }
    }
}

