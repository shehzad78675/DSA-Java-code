package Functions;

import java.util.Scanner;

public class CheckNumberIsPrime {

    public static boolean checkIsPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int number = sc.nextInt();

        System.out.println(checkIsPrime(number));
    }
}
