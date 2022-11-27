package Arrays;

public class MaxSumUPrefixSum {
    public static int maxSum(int arr[]){
        int[] prefix = new int[arr.length];
        // int max = Integer.MIN_VALUE;
        
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int max = 0;

        for(int i=0; i<=prefix.length; i++){
            for(int j=i; j<prefix.length; j++){
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(max < currSum){
                    max = currSum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,6};
        System.out.println(maxSum(arr));
    }
}
