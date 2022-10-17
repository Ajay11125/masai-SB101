package Week2_Evaluation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Question_5 {
    public static void main(String[] args) {
        List<Student>ls=new ArrayList<>();
        ls.add(new Student(101,"Ajay",25,"yadavajay","1234",(new Address("MP","nmh","458441"))));
        ls.add(new Student(102,"Ajay2",26,"yadavajay12","1238",(new Address("UP","hryana","4581"))));
        ls.add(new Student(103,"Ajay6",29,"yadavajay85","1294",(new Address("hr","indor","451441"))));
        ls.add(new Student(106,"Ajay84",20,"yadavajay95","1262",(new Address("Rj","nmh","458441"))));
        ls.add(new Student(101,"Ajay",25,"yadavajay","1234",(new Address("MP","nmh","458441"))));

        try {
            FileOutputStream fos = new FileOutputStream("studentdata.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
class demo2{
    public static void main(String[] args) {
        List<Student> ls=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream("studentdata.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ls=(ArrayList) ois.readObject();
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        ls.forEach(s->{
            System.out.println(s);
        });
        ls.add(new Student(101,"Ajay84",205,"yadavajay48","122334",(new Address("him","nmh","45641"))));


    }
}
class Address implements Serializable{
    String state;
     String city;
    String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}'+"\n";
    }

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }
}
class Student implements Serializable {
    int roll;
    String name;
    int marks;
    String email ;
    String password;
    Address address;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}'+"\n";
    }

    public Student(int roll, String name, int marks, String email, String password, Address address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}


