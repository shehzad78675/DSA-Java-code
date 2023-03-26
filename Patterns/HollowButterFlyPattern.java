import java.util.Scanner;

public class HollowButterFlyPattern {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==1 || j==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }

                for(int j=1; j<=n; j++){
                    if(j==n || j==n-i+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }

            for(int i=n; i>=1; i--){
                for(int j=1; j<=n; j++){
                    if(j==1 || j==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }

                for(int j=1; j<=n; j++){
                    if(j==n || j==n-i+1){
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
