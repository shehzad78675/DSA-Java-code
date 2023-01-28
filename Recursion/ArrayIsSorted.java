package Recursion;

public class ArrayIsSorted {
    public static boolean arrayIsSorted(int arr[], int lastIndex){
        if(lastIndex == 0){
            return true;
        }

        if(arr[lastIndex] < arr[lastIndex-1]){
            return false;
        }
        return arrayIsSorted(arr, lastIndex-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(arrayIsSorted(arr, 4));
    }
}
