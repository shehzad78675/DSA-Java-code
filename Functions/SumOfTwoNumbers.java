package Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void sum(int a, int b){
        System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter second number ");
            int secondNumber = sc.nextInt();

            sum(firstNumber, secondNumber);
        }
    }
}
