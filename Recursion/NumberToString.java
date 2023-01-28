package Recursion;

public class NumberToString {
    static String num[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    public static void numberToString(int n){
        if(n == 0){
            return;
        }

        int digit = n%10;
        numberToString(n/10);
        System.out.print(num[digit] + " ");
    }
    public static void main(String[] args) {
        numberToString(2019);
    }
}
