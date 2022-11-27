package Arrays;

public class SmallestNumber {
    public static int findSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,9,3,5,7};
        System.out.println(findSmallest(arr));
    }
}
