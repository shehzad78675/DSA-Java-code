package Arrays;

public class ReverseArray {
    public static void reverseArrary(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArrary(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,6};
        printArrary(arr);
        reverseArrary(arr);
        printArrary(arr);
    }
}
