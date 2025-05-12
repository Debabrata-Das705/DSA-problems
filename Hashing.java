import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,1,3,3,4};
        int n=a.length;
        int hash[]=new int [n+1];
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }
        for(int i=0;i<n;i++){
            hash[a[i]]++;
        }
        System.out.println("Enter element");
        int ele=sc.nextInt();
        System.out.println(hash[ele]);
    }
}
