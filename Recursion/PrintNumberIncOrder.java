package Recursion;

public class PrintNumberIncOrder {
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        printNumber(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNumber(10);
    }
}
