package BitManiPulation;

public class ClearRangeOfBits {
    public static int clearBits(int n, int i, int j){
        int a = -1 << i;
        // int a = (1 << i) - 1;  also use
        a = ~a;
        int b = -1<<j+1;

        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearBits(31, 1, 3));
    }
}
