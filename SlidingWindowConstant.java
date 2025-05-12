public class SlidingWindowConstant {
    public static void main(String[] args) {
        int a[]={1,-2,3,5,4,-2,6};
        int k=4;
        int left=0;
        int right=k-1;
        int maxsum=0;
        int sum=0;
        for(int i=left;i<=right;i++){
            sum=sum+a[i];
        }                             //Time complexcity=O(n)
        while(right<a.length-1){
           
            
            sum=sum-a[left];
            right++;
            left++;
            sum=sum+a[right];
            maxsum=Math.max(maxsum,sum);
            
           
        }
        left--;
        right--;
        System.out.println(maxsum);
        System.out.println(left+" to "+right);

    }
}
