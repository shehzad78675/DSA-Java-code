package Recursion;

public class FirstOccurrence {
    public static int firstOccurrence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }

        if(key == arr[i]){
            return i;
        }

        return firstOccurrence(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3,7};
        System.out.println(firstOccurrence(arr, 0, 7));
    }
}
