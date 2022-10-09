package SB101_day1_assignment;

import java.util.*;
public class Emplyee_class {
    public static void main(String[] args)  {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Operation (1,2,3): ");
        int op=input.nextInt();
        if(op==1){
            TreeSet<Emplyee_Bean>ts=new TreeSet<>();
            ts.add(new Emplyee_Bean(1,"Ajay","Delhi",25000));
            ts.add(new Emplyee_Bean(5,"veer","Banglore",12000));
            ts.add(new Emplyee_Bean(7,"krishna","Gwalior",21000));
            ts.add(new Emplyee_Bean(4,"shivam","Manipuri",21000));
            ts.add(new Emplyee_Bean(2,"KM","Tong",26000));
            ts.add(new Emplyee_Bean(3,"Soni","Nmh",15000));
            System.out.println(ts.toString());
        }
        else if(op==2){
            empaddress empadd=new empaddress();
            TreeSet<Emplyee_Bean>ts=new TreeSet<>(empadd);
            ts.add(new Emplyee_Bean(1,"Ajay","Delhi",25000));
            ts.add(new Emplyee_Bean(5,"veer","Banglore",12000));
            ts.add(new Emplyee_Bean(7,"krishna","Gwalior",21000));
            ts.add(new Emplyee_Bean(4,"shivam","Manipuri",21000));
            ts.add(new Emplyee_Bean(2,"KM","Tong",26000));
            ts.add(new Emplyee_Bean(3,"Soni","Nmh",15000));
            System.out.println(ts.toString());
        }
        else{
            emp_Salary empsal=new emp_Salary();
            TreeSet<Emplyee_Bean>ts=new TreeSet<>(empsal);
            ts.add(new Emplyee_Bean(1,"Ajay","Delhi",25000));
            ts.add(new Emplyee_Bean(5,"veer","Banglore",12000));
            ts.add(new Emplyee_Bean(7,"krishna","Gwalior",21000));
            ts.add(new Emplyee_Bean(4,"shivam","Manipuri",21000));
            ts.add(new Emplyee_Bean(2,"KM","Tong",26000));
            ts.add(new Emplyee_Bean(3,"Soni","Nmh",15000));
            System.out.println(ts.toString());
        }






    }
}
