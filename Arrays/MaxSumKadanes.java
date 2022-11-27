package Arrays;

public class MaxSumKadanes {
    public static int maxSum(int arr[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int nMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];


            if(currSum > nMax){
                nMax = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }

            max = Math.max(currSum, max);
        }

        if(max == 0 && nMax != 0){
            return nMax;
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3,0};
        System.out.println(maxSum(arr));
    }
}
