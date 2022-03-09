package studentproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class StudentMenu {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> stuList = new ArrayList<Student>();

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Create");
            System.out.println("2.Search");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.DisplayData");
            System.out.println("Exit(press -1)");


            System.out.println("Please chose your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    readStudentData();
                    break;
                case 2:
                    SearchStudentByName();
                    break;
                case 3:
                    updateStudentData();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    DisplayData();
                    break;

            }
        } while (choice != -1);
        System.out.println("Program ends");

    }

    private static void DisplayData() {
               if(stuList.isEmpty()) {
                System.out.println("empty list!!!!!!................");
            }
            else{
            System.out.println(stuList);
            }
        }

    private static void SearchStudentByName() {
        Student stu = new Student();
        System.out.println("enter name of the student that we want to search");
        String getname = scanner.next();
        for (int index = 0; index < stuList.size(); index++) {
            stu = stuList.get(index);
            if (stu.getName().equalsIgnoreCase(getname)) {
                System.out.println(stu);
                break;

            } else {
                System.out.println("entered name is not found in the list!!!!!!");

            }
        }
    }
        private static void updateStudentData () {
            Student stu = new Student();

            System.out.println("enter usn of the student that we want to update");
            int usnId = scanner.nextInt();
            for (int index = 0; index < stuList.size(); index++) {
                stu = stuList.get(index);
                if (stu.getUsn() == usnId) {
                    System.out.println("enter NAME of the student");
                    String name = scanner.next();
                    System.out.println("enter USN of the student");
                    int usn = scanner.nextInt();
                    System.out.println("enter BRANCH of the student");
                    String branch = scanner.next();
                    System.out.println("enter COLLEGE of the student");
                    String college = scanner.next();
                    stuList.remove(stu);
                    Student update = new Student(name, usn, branch, college);
                    stuList.add(update);
                    break;
                } else {
                    System.out.println("usn not found in the list!!!1!");


                }
            }
        }


        private static void readStudentData () {
            System.out.println("enter NAME of the student");
            String name = scanner.next();
            System.out.println("enter USN of the student");
            int usn = scanner.nextInt();
            System.out.println("enter BRANCH of the student");
            String branch = scanner.next();
            System.out.println("enter COLLEGE of the student");
            String college = scanner.next();
            Student stu1 = new Student(name, usn, branch, college);
            stuList.add(stu1);
        }

    private static void deleteStudent() {
        System.out.println("enter student usn u want to delete");
        int usn = scanner.nextInt();
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getUsn() == usn) {
                stuList.remove(stu);
                System.out.println("student record successfully deleted....");
                break;
            } else {
                System.out.println("usn not found in the list!!!1!");
            }
        }
    }
}


