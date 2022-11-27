package Arrays;

public class LargestNumber {
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,9,3,5,7};
        System.out.println(findLargest(arr));
    }
}
