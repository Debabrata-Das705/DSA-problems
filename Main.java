import java.util.*;

class Solution {
    /* Function to find two indices in the array `nums`
       such that their elements sum up to `target`.
    */
    public int[] twoSum(int[] nums, int target) {
        
        // Map to store (element, index) pairs
        Map<Integer, Integer> mpp = new HashMap<>();
        
        // Size of the nums array
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Current number in the array
            int num = nums[i];
            
            // Number needed to reach the target
            int moreNeeded = target - num;

            // Check if the complement exists in map
            if (mpp.containsKey(moreNeeded)) {
                /* Return the indices of the two
                numbers that sum up to target*/
                return new int[]{mpp.get(moreNeeded), i};
            }

            // Store current number and its index in map
            mpp.put(num, i);
        }

        // If no such pair found, return {-1, -1}
        return new int[]{-1, -1};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 6;

        // Create an instance of Solution class
        Main2 sol = new Main2();
        
        // Call the twoSum method from Solution class
        int[] ans = sol.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers that sum up to " + target + " are: [" + ans[0] + ", " + ans[1] + "]");
    }
}
