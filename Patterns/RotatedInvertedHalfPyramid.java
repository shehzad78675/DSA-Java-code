import java.util.Scanner;

class RotatedInvertedHalfPyramid{
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j >= n-i+1){

                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
        }
    }
}