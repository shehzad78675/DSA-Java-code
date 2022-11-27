package Functions;

import java.util.Scanner;

public class Product {
    public static int product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number ");
        int secondNumber = sc.nextInt();

        System.out.println(product(firstNumber, secondNumber));
    }
}
