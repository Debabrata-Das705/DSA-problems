import java.util.*;
public class majorityEle {
    public static void main(String[] args) {;
        int a []={2,2,3,3,3,3,2};
        int k=a.length/2;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       
        for(int i=0;i<a.length;i++){
            int feq=1;
            if(map.containsKey(a[i])){
                feq=map.get(a[i]);
                feq++;
            }
            map.put(a[i],feq);
        }
        for(Integer i:map.keySet()){
            if(map.get(i)>k){
                System.out.println(i+" ");
            }
           
        }
    }
}
