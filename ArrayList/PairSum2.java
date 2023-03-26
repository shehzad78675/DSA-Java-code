package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i+1) < list.get(i)){
                bp = i;
                break;
            }
        }

        int rp = bp;
        int lp = bp+1;
        while(lp != rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum == target){
                return true;
            }else if(sum < target){
                lp = (lp+1) % list.size();
            }else{
                rp = (list.size()+rp-1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(pairSum2(list, 10));
    }
}
