package Recursion;

public class RemoveDuplicatesInString {
    public static void removeDuplicates(String str, int ind, StringBuilder newStr, int map[]) {
        if (ind == str.length()) {
            System.out.println(newStr);
            return;
        }
        int chInd = str.charAt(ind) - 'a';
        if (map[chInd] == 1) {
            removeDuplicates(str, ind + 1, newStr, map);
        } else {
            map[chInd] = 1;
            removeDuplicates(str, ind + 1, newStr.append(str.charAt(ind)), map);
        }
    }

    public static void main(String[] args) {
        int map[] = new int[26];
        removeDuplicates("aabbbcccd", 0, new StringBuilder(""), map);
    }
}
