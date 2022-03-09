package projectMap;

public class Teacher {

    String teacherName;
    int classId;

    public Teacher(String teacherName, int classId) {
        this.teacherName = teacherName;
        this.classId = classId;
    }

    public Teacher() {
        
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", classId=" + classId +

                '}';
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}



