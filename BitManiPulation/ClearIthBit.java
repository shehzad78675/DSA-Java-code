package BitManiPulation;

public class ClearIthBit {
    public static int clearIthBit(int n, int i){
        int bitMask = 1 << i;
        bitMask = ~bitMask;

        return bitMask & n;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(5,1));
    }
}
