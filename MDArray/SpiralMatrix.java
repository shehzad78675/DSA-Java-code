package MDArray;

public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]){
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        for(int i=0; i<arr.length/2; i++){
            for(int j=startCol; j<endCol; j++){
                System.out.print(arr[startRow][j] + " ");
            }
            
            for(int j=startRow; j<endRow; j++){
                System.out.print(arr[j][endCol] + " ");
            }

            for(int j=endCol; j>startCol; j--){
                System.out.print(arr[endRow][j] + " ");
            }

            for(int j=endRow; j>startRow; j--){
                System.out.print(arr[j][startCol] + " ");
            }

            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        {17,18,19,20}};
        spiralMatrix(arr);
    }
}
