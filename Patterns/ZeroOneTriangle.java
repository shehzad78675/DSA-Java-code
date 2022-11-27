import java.util.Scanner;

class ZeroOneTriangle {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {

                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }
        // for(int i=1; i<=n; i++){
        // int num = 1;
        // if(i%2 == 0){
        // num = 0;
        // }
        // for(int j=1; j<=i; j++){
        // if(j == 1){

        // System.out.print(num + " ");
        // }else{
        // if(num == 0){
        // num = 1;
        // System.out.print(num + " ");
        // }else{
        // num = 0;
        // System.out.print(num + " ");
        // }
        // }

        // }
        // System.out.println();
        // }
    }
}