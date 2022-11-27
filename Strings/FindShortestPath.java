package Strings;

public class FindShortestPath {
    public static int shortestPath(String str){
        int x = 0;
        int y = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'W'){
                x--;
            }else if(str.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }

        return (int)Math.sqrt((x*x) + (y*y));
    }

    public static void main(String[] args) {
        System.out.println(shortestPath("WNEENESENNN"));
    }
}
