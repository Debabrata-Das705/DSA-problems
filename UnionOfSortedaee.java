import java.util.*;
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set <Integer> s=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
         for(int j=0;j<nums1.length;j++){
            s.add(nums2[j]);
        }
        int b[]=new int[s.size()];
        int c=0;
        for(int i:s){
            b[c]=i;
            c++;
        }
        return b;
    }
   
}