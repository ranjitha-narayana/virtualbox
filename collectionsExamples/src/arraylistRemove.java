import java.util.ArrayList;

public class arraylistRemove {
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("sam");
        list1.add("ram");
        list1.add("cat");
        list1.add("fish");
        System.out.println("before removal"+list1);
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("sam");
        list2.add("Dog");
        list2.add("cat");
        list2.add("rabbit");
        list2.add("lion");
        System.out.println("before removal"+list2);
        list2.removeAll(list1);
        System.out.println("After removal"+list2);

    }
}
