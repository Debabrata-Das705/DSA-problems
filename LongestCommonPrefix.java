import java.util.*;
public class LongestCommonPrefix {
    public static String LCP(String [] s){
        int n=s.length;
        Arrays.sort(s);
        String first=s[0];
        String last=s[n-1];
        String ans=" ";
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            ans=ans+first.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s[]={"flowers","flight","float","flow"};
        System.out.println(LCP(s));
    }
}
