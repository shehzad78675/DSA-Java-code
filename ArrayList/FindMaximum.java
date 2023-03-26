package ArrayList;
import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(13);
        list.add(42);
        list.add(35);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
