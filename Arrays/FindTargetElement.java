package Arrays;

public class FindTargetElement {
    public static int findTargetElement(int arr[], int tar){
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] > arr[end]){
            int pivot = pivot(arr);
            if(arr[pivot-1] > tar && arr[start] > tar){
                return search(arr, tar, pivot, end);
            }else{
                return search(arr, tar, start, pivot - 1);
            }
        }
        return search(arr, tar, start, end);
    }

    public static int search(int arr[], int tar, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == tar){
                return mid;
            }else if(arr[mid] > tar){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int pivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid > 0 && arr[mid] < arr[mid-1]){
                return mid;
            }else if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,4,5, 6, 7};
        System.out.println(findTargetElement(arr, 0));
    }
}
