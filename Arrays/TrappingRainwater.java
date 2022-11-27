package Arrays;

public class TrappingRainwater {
    public static int trappingRainwater(int arr[]){
        int laftMax[] = new int[arr.length];
        int rigntMax[] = new int[arr.length];

        laftMax[0] = arr[0];
        rigntMax[arr.length - 1] = arr[arr.length - 1];
        
        for(int i=1; i<arr.length; i++){
            laftMax[i] = Math.max(laftMax[i-1], arr[i]);
            rigntMax[arr.length - 1 - i] = Math.max(rigntMax[arr.length - i], arr[arr.length - 1 - i]);
        }

        int trappedWater = 0;

        for(int i=0; i<arr.length; i++){
            trappedWater += Math.min(laftMax[i], rigntMax[i]) - arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappingRainwater(arr));
    }
}
