package Backtraking;

public class GridWaysOptimized {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int gridWays(int n, int m) {
        return factorial(n - 1 + m - 1) / (factorial(n - 1) * factorial(m - 1));
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3, 3));
    }
}
