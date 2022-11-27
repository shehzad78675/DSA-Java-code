package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        int mid = start + (end - start) / 2;

        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7};
        System.out.println(binarySearch(arr, 7));
    }
}
