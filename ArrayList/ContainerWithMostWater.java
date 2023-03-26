package ArrayList;
import java.util.ArrayList;;

public class ContainerWithMostWater {
    // Brute Force
    public static int containerWithMostWater(ArrayList<Integer> list){
        int maxWater = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int height = Math.min(list.get(i), list.get(j));
                int width = j-i;

                if((height*width) > maxWater){
                    maxWater = height*width;
                }
            }
        }
        return maxWater;
    }

    // 2 Pointer Approch
    public static int containerWithMostWater1(ArrayList<Integer> list){
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            if((height*width) > maxWater){
                maxWater = height*width;
            }

            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(containerWithMostWater1(list));
    }
}
