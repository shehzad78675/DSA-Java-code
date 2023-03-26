package ArrayList;
import java.util.ArrayList;;

public class SwapNumbers {
    public static void swap(ArrayList<Integer> list, int ind1, int ind2){
        int temp = list.get(ind2);
        list.set(ind2, list.get(ind1));
        list.set(ind1, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(13);
        list.add(42);
        list.add(35);

        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);
    }
}
