package Recursion;

public class SumOfNumbers {
    public static int sumOfNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumOfNumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5));
    }
}
