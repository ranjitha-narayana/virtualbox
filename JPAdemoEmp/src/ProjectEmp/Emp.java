package ProjectEmp;

public class Emp {
    private String empName;
    private int empId;
    private String dept;
    private float salary;

    public Emp() {

    }

    public Emp(String empName, int empId, String dept, float salary) {
        super();
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
        this.salary = salary;
        //System.out.println("Constructor got called!!!!!");
    }

    public Emp(String empName , int empId, Emp emp) {
        this.empName = empName;
        this.empId = empId;
        this.dept = emp.dept;
        this.salary = emp.salary;

    }


    @Override
    public String toString() {
        return "\n\nEmp [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", salary=" + salary + "]";
    }

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }


}
