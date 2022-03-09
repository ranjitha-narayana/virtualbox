import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<String> demo=new ArrayList<String>();
        demo.add("mysore");
        demo.add("hyd");
        demo.add("bangalore");
        demo.add("hampi");
        System.out.println("Before sorting"+demo);
        Collections.sort(demo);
        System.out.println("After sorting"+demo);
    }
}
