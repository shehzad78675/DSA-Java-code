package Recursion;

public class LengthOfString {
    public static int lengthOfString(String str, int i){
        if(str == ""){
            return i;
        }

        str = str.substring(i);
        return lengthOfString(str, i+1);
    }
    public static void main(String[] args) {
        System.out.println(lengthOfString("she", 1));
    }
}
