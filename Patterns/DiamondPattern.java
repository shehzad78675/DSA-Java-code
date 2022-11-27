import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i*2-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=n*2-(i*2-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
