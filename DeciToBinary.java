import java.util.*;
public class DeciToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n=sc.nextInt();
        int a[]=new int[1000];
        int i=0;
        while(n>0){
            a[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);

        }
    }
}
