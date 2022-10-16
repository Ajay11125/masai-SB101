package SB101_day3_assignment;

import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Map<String, Student_bean> student = new HashMap<>();
        student.put("china", new Student_bean(101, "Ajay", "yadavajay36952", 24));
        student.put("India", new Student_bean(105, "veer", "yadavajay741", 29));
        student.put("Indonesia", new Student_bean(103, "shubh", "yadavajay789", 2));
        student.put("Pakistan", new Student_bean(102, "Soni", "yadavajay456", 58));
        student.put("France", new Student_bean(106, "Akash", "yadavajay123", 5));
        System.out.println(student);

    }
}
