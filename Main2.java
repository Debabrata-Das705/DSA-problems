public class Main2 {
    public static void main(String[] args) {
        // Initialize the arrays
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

        // Create an instance of the Solution class
        Solution finder = new Solution();

        /* Get the union of nums1 and 
        nums2 using the class method */
        int[] union = finder.unionArray(nums1, nums2);

        System.out.println("Union of nums1 and nums2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
