package Arrays;

public class RemoveElement {
    public static int removeElement(int arr[], int val){
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[k++] = arr[i];
            }
        }
        return k;
    }
    public static void printArrary(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
        printArrary(arr);
    }
}
