package BitManiPulation;

public class SwapWithOutThirdVari {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("a = " + a + " " + "b = " + b);
        // a = a+b;
        // b = a-b;
        // a = a-b;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = " + a + " " + "b = " + b);
    }
}
