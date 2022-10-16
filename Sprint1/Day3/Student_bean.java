package SB101_day3_assignment;

public class Student_bean {
    private int roll;
    private String Name;
    private String email;
    private int marks;

    public int getRoll() {
        return roll;
    }

    public Student_bean(int roll, String name, String email, int marks) {
        this.roll = roll;
        this.Name = name;
        this.email = email;
        this.marks = marks;
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

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student_bean{" +
                "roll=" + roll +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", marks=" + marks +
                '}'+'\n';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


}
