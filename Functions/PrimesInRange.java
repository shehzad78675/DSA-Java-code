package Functions;

import java.util.Scanner;

public class PrimesInRange {
    public static void primes(int n){
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number ");
            int number = sc.nextInt();

            primes(number);
        }
    }
}
