package projectMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass {
    public static void main(String[] args) {

        // demo.put(new Teacher("SAM",1),new SubjectClass("java",12));
        /*Teacher t=new Teacher();
        SubjectClass sc=new SubjectClass();
        demo.put(t.setTeacherName("sam"),sc.setSub_no(12));
        demo.put(t.setTeacherName("ram"),t.setClassId(123));
        System.out.println(demo);
        */
        Map<Teacher,SubjectClass> demo=new HashMap<Teacher,SubjectClass>();
        demo.put(new Teacher("SAM", 12), new SubjectClass("java", 123));
        demo.put(new Teacher("RAM", 22), new SubjectClass("C", 222));
        demo.put(new Teacher("VIKRAM", 2), new SubjectClass("python", 323));
        demo.put(new Teacher("PAVI", 19), new SubjectClass("C++", 423));
        for (Entry<Teacher, SubjectClass> entry : demo.entrySet()) {
            System.out.println("key " + entry.getKey() + " " + " value : " + entry.getValue());
        }

    }
}