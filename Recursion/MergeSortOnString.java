package Recursion;

public class MergeSortOnString {
    public static String[] mergeSort(String arr[], int start, int end){
        if(start == end){
            String arr1[] = { arr[start] };
            return arr1;
        }

        int mid = start + (end - start)/2;
        String arr1[] = mergeSort(arr, start, mid);
        String arr2[] = mergeSort(arr, mid+1, end);

        return merge(arr1, arr2);
    }

    public static String[] merge(String arr1[], String arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        String arr3[] = new String[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(isAphabaticallySmaller(arr1[i], arr2[j])){
                arr3[k++] = arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }
        }

        while(i < n){
            arr3[k++] = arr1[i++];
        }

        while(j < m){
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    public static boolean isAphabaticallySmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }

    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String arr1[] = mergeSort(arr, 0, arr.length-1);

        printArray(arr1);
    }
}
