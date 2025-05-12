import java.util.*;
public class AppreanceOfElement {
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,4};
        // int c=0;
        // for(int i=0;i<a.length;i++){
        //     c=0;
        //     for(int j=0;j<a.length;j++){
        //         if(a[i]==a[j]){
        //             c++;
        //         }
        //     }
        //     if(c==1){
        //         System.out.println(a[i]);
        //     }
        // }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            int key=a[i];
            int freq=1;
            if(map.containsKey(key)){
                freq=map.get(key);
                freq++;
               
            }
            map.put(key, freq);
        }
        System.err.println(map);
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
               // System.out.println(i);
            }
        }
    }
}
