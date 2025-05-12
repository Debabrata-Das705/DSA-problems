import java.util.*;
public class Reversewords {
    public static String reverseWords(String s) {
        String b="";
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            b=b+a[i]+" ";
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Ram is a boy"));
    }
}
