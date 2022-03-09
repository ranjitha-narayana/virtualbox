package ProjectEmp;

import java.util.*;

public class EmpMenu {

    static Scanner scanner = new Scanner(System.in);
    static  List<Emp> empList =  new ArrayList<Emp>();
    public static void main(String[] args) {
        int choice=0;
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
            switch(choice){
                case 1:
                    readEmpData();
                    break;
                case 2:
                    searchEmp();
                    break;
                case 3:
                    updateEmpData();
                    break;
                case 4:
                    deleteEmp();
                    break;
                case 5 : System.out.println(empList);
                break;
            }
        }while(choice != -1);
        System.out.println("Program ends");

    }

    private static void deleteEmp() {
        System.out.println("enter Emp id u want to delete");
        int Id = scanner.nextInt();
        for (int i = 0; i < empList.size(); i++) {
            Emp emp = empList.get(i);
            if (emp.getEmpId() == Id) {
                empList.remove(emp);
                System.out.println("record deleted succcessfully");

            }
        }
    }

    private static void searchEmp() {


        System.out.println("enter Emp id u want to update");
        int Id = scanner.nextInt();
        for (int i = 0; i< empList.size(); i++){
            Emp emp=empList.get(i);
            if (emp.getEmpId()==Id){
                System.out.println(emp);
                break;
            }
            else{
                System.out.println("emp Id not found");
            }
        }

    }

    private static void updateEmpData() {

        System.out.println("enter Emp id u want to update");
        int Id = scanner.nextInt();
        for (int i = 0; i < empList.size(); i++) {
           Emp emp=empList.get(i);
            if (emp.getEmpId()==Id) {
                System.out.println("enter Emp Name");
                String empName = scanner.next();

                System.out.println("enter Emp ID");
                int empId = scanner.nextInt();

                System.out.println("enter Emp Dept");
                String dept = scanner.next();

                System.out.println("enter Emp Salary");
                float salary = scanner.nextFloat();

                Emp newEmp1 = new Emp(empName,empId,dept,salary);

                empList.add(newEmp1);
                break;
            }
else{
                System.out.println("Id doesnot exist");
            }
        }
    }
    private static void readEmpData() {
        System.out.println("enter Emp Name");
        String empName = scanner.next();

        System.out.println("enter Emp ID");
        int empId = scanner.nextInt();

        System.out.println("enter Emp Dept");
        String dept = scanner.next();

        System.out.println("enter Emp Salary");
        float salary = scanner.nextFloat();

        Emp newEmp = new Emp(empName, empId, dept, salary);

        empList.add(newEmp);

    }

}

