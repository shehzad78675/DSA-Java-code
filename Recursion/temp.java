package Recursion;

public class temp {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int ans = pow(x, n / 2);
        ans = ans * ans;
        if (n % 2 != 0) {
            ans = ans * x;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
