package Functions;

import java.util.Scanner;

public class BinaryToDecimal{
    public static int binaryToDecimal(int binNum){
        int dec = 0;
        int pow = 0;

        while(binNum > 0){
            int num = binNum % 10;
            dec = dec + (num * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int number = sc.nextInt();

        System.out.println(binaryToDecimal(number));
    }
}