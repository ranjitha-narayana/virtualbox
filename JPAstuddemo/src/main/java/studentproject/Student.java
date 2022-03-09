package studentproject;

public class Student {

    private String name;
    private int usn;
    private String branch;
    private String college;

    public Student(String name, int usn, String branch, String college) {
        this.name = name;
        this.usn = usn;
        this.branch = branch;
        this.college = college;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", usn=" + usn +
                ", branch='" + branch + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsn() {
        return usn;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

