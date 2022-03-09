package streamproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args){
        List<Student> l=new ArrayList<Student>();
        Student stu1=new Student();
        stu1.setId(76);
        stu1.setName("sam");
        stu1.setCollege("presidency");
        stu1.setBranch("cs");
        Student stu2=new Student();
        stu2.setId(12);
        stu2.setName("ran");
        stu2.setCollege("sjc");
        stu2.setBranch("IS");
        Student stu3=new Student();
        stu3.setId(1);
        stu3.setName("ram");
        stu3.setCollege("svit");
        stu3.setBranch("ME");
        l.add(stu1);
        l.add(stu2);
        l.add(stu3);
        List<Student> record=l.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

        System.out.print(record);


    }
}
