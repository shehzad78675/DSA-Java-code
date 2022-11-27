package Arrays;

public class MinSumOfSubArrays {
    public static int minSumOfSubArrays(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum < min){
                    min = sum;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,6};
        System.out.println(minSumOfSubArrays(arr));
    }
}
