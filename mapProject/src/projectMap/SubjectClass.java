package projectMap;

public class SubjectClass {
    String subjecName;
    int sub_no;

    public SubjectClass(String subjecName, int sub_no) {
        this.subjecName = subjecName;
        this.sub_no = sub_no;
    }

    public SubjectClass() {

    }

    @Override
    public String toString() {
        return "SubjectClass{" +
                "subjecName='" + subjecName + '\'' +
                ", sub_no=" + sub_no +
                '}';
    }

    public String getSubjecName() {
        return subjecName;
    }

    public void setSubjecName(String subjecName) {
        this.subjecName = subjecName;
    }

    public int getSub_no() {
        return sub_no;
    }

    public void setSub_no(int sub_no) {
        this.sub_no = sub_no;
    }
}

