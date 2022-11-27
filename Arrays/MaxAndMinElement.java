package Arrays;

public class MaxAndMinElement {
    public static void minAndMaxElement(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }

    public static void main(String[] args) {
        int arr[] = {4,1,6,9,23,54};
        minAndMaxElement(arr);
    }
}
