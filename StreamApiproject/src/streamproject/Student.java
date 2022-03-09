package streamproject;

public class Student {
    int id;
    String name;
    String college;
    String branch;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

    public Student(int id, String name, String college, String branch) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.branch = branch;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
