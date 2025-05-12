import java.util.*;
public class largestOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer string ");
        String str=sc.nextLine();
        int j=0;
        int i=str.length()-1;
        while(i>=0){
            int d=str.charAt(i)-'0';
            if(d % 2 !=0){
                while(str.charAt(j)=='0'){
                    j++;
                }
                System.out.println(str.substring(j, i+1));
                break;
            }
            i--;
        }
    }
}
