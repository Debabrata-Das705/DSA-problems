import java.util.*;
class Twosum2 {
    public  static void twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++ ){
       
        int a=nums[i];
        if(map.containsKey(target-a)){
            System.out.println(i+"   "+map.get(target-a));
        }
            map.put(nums[i],i);
           }
          
        }
    
    public static void main(String []args){
        int nums[]={5,3,2,4,1};
        int target=6;
        twoSum(nums,target);
    }
}

