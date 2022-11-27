package Arrays;

public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int arr[]){
        int len = arr.length;
        int end = arr.length;
        for(int i=0; i<end; i++){
            System.out.println(arr[i]);
            if(arr[i] == arr[i+1]){
                int ind = i+1;
                while(ind < end-1){
                    arr[ind] = arr[ind+1];
                    ind++;
                }
                i--;
                end--;
            }
        }
        return len - end;
    }

    public static int removeDupl(int[] nums){
        int k = 1;
        for (int i = 1; i < nums.length; ++i)        
		    if (nums[i] != nums[i-1]) nums[k++] = nums[i];     
	    return k;
    }

    public static void printArrary(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,1,2,2,3,3,4};
        System.out.println(removeDupl(arr));
        printArrary(arr);
    }
}
