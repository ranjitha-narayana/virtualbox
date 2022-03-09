import java.util.*;

public class UniqueCollection {
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<>();
        list1.add("rani");
        list1.add("vivek");
        list1.add("hani");
        list1.add("ani");
        list1.add("ani");
        list1.add("rani");
        Set<String> list2=new TreeSet<>(list1);
        System.out.println("ArrayList UNIQUE ELEMENTS");
        for (String str:list2){
            System.out.println(str);
        }


    }
}
