package BitManiPulation;

public class ModularExponentiation {
    public static int modularExponentiation(int a, int n, int m){
        int ans = 1;
        while(n != 0){
            if((n&1) == 1){
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }

        return ans % m;
    }
    public static void main(String[] args) {
        System.out.println(modularExponentiation(5, 3, 13));
    }
}
