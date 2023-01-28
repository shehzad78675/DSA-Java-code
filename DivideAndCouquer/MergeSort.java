package DivideAndCouquer;

public class MergeSort {
    public static void mergeSort(int arr[], int start, int end){
        // Base case
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid); // left part
        mergeSort(arr, mid+1, end); // right part

        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end){
        // left(0, 3) = 4 size  right(4,6) = 3 size
        // start = 0, end = 6 -> 6-0+1 = 7 size
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(k=0, i=start; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
