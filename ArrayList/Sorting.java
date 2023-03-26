package ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(13);
        list.add(42);
        list.add(35);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
