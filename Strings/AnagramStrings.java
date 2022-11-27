package Strings;

public class AnagramStrings {
    public static boolean isAnagrams(String str1, String str2){
        int firstStr = 0;
        int secondStr = 0;

        for(int i=0; i<str1.length(); i++){
            firstStr += str1.charAt(i);
            secondStr += str2.charAt(i);
        }
        return firstStr == secondStr;
    }

    public static void main(String[] args) {
        System.out.println(isAnagrams("car", "acr"));
    }
}
