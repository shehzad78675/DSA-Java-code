package Functions;

import java.util.Scanner;

public class Factorial{
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int number = sc.nextInt();

        System.out.println(factorial(number));
    }
}