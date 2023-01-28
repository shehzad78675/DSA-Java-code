package Recursion;

public class AllOccurrence {
    public static void allOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }

        if(key == arr[i]){
            System.out.print(i + " ");
        }
        allOccurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        allOccurrence(arr, 2, 0);
    }
}
