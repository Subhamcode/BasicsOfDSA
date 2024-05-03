package OOPS1;

import java.sql.SQLOutput;

public class StudentUse {

    public static void main(String[] args) {
        Student s1=new Student(12,"sam");
        Student s2=new Student(11,"ram");

        System.out.println(s1.getRoll());
        System.out.println(s1.name);



        System.out.println(s2.getRoll());
        System.out.println(s2.name);

        System.out.println(Student.numStudents);

    }
}
