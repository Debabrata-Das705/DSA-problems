import java.util.*;
class Sollution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
         Set<Integer> s=new HashSet<>();
         int c=0;
         for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   if( s.add(nums1[i])){
                        c++;
                   }
                   
                }
            }
         }
    int ans[]=new int[c];
    int i=0;
    for(Integer x:s){
        ans[i]=x;
        i++;
 
    }
    return ans;
    }
    public static void main(String[] args) {
        Sollution s1=new Sollution();
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};
        int[] ans = s1.intersectionArray(nums1, nums2);
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}