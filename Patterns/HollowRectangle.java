import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number");
            int n = sc.nextInt();

            for(int i = 1; i <= n-1; i++){
                for(int j = 1; j <= n; j++){
                    if(i == 1 || i == n-1 || j == 1 || j == n){
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
