import java.util.*;
public class dubplicateproblem {
    public static  void printArr(int a[]){
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        System.out.println(s);
        // int i=0;
        // for(int j=1;j<a.length;j++){
        //     if(a[i]!=a[j]){
        //         a[i+1]=a[j];
        //         i++;
        //     }
        // }
        // int b[]=new int[i+1];
        // for(int k=0;k<b.length;k++){
        //    b[k]=a[k];
        // }
        // for(int k=0;k<b.length;k++){
        //     System.out.print(b[k]+" ");
        // }
    } 
                            // public static boolean cheak(int a[]){
                            //     int i=0;
                            //     for(int j=1;j<a.length;j++){
                            //         if(a[j]-a[i]<=2){
                            //             return true;
                            //         }
                            //         i++;
                            //     }
                            //     return false;
                            // }
    public static void main(String[] args) {
        int a[]={1,6,6,6,1,1,9};
     // System.out.println( cheak(a));
      printArr(a);
    }
}
