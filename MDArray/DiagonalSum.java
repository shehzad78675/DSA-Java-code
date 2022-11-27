package MDArray;

public class DiagonalSum{
    public static int diagonalSum(int matrix[][]){
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        int n = matrix.length;

        for(int i=0; i<n; i++){
            primaryDiagonalSum += matrix[i][i];
            if(i == n-1-i){
                continue;
            }
            secondaryDiagonalSum += matrix[i][n-1-i];
        }

        return primaryDiagonalSum + secondaryDiagonalSum;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(diagonalSum(arr));
    }
}