package Recursion;

public class NumberOfStringCount {
    public static int numberOfStringCount(String str, int start, int end, int length){
        if(length == 1){
            return 1;
        }

        if(length <= 0){
            return 0;
        }

        int result = numberOfStringCount(str, start+1, end, length-1) + numberOfStringCount(str, start, end-1, length-1) - numberOfStringCount(str, start+1, end-1, length-2);

        if(str.charAt(start) == str.charAt(end)){
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abca";
        System.out.println(numberOfStringCount(str, 0, str.length()-1, str.length()));
    }
}
