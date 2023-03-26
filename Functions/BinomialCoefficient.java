package Functions;

import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= i;
        }
        return ans;
    }

    public static int binomialCoefficient(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n ");
            int n = sc.nextInt();

            System.out.print("Enter r ");
            int r = sc.nextInt();

            System.out.println(binomialCoefficient(n, r));
        }
    }
}
