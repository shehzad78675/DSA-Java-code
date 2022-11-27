package MDArray;

public class SearchInSortedMatrix {
    public static void stairCaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("(" + row + ", " + col + ")");
                return; 
            }else if(matrix[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        {17,18,19,20}};
        stairCaseSearch(arr, 19);
    }
}
