package DivideAndCouquer;

public class QuickSort {
    public static void quickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int pInd = partition(arr, start, end);
        quickSort(arr, start, pInd-1);
        quickSort(arr, pInd+1, end);
    }

    public static int partition(int arr[], int start, int end){
        int i = start - 1;
        int pivot = arr[end];

        for(int j=start; j<end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        arr[end] = arr[i];
        arr[i] = pivot;

        return i;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,0};
        printArray(arr);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
