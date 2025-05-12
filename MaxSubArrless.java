public class MaxSubArrless {
    public static void main(String[] args) {
        int a[]={2,5,1,10,10};
        int k=15;
        int l=0;
        int right=0;
        int sum=0;
        int maxLen=0;
        while(right<a.length){
            sum=sum+a[right];
            if(sum<=k){
                maxLen=Math.max(maxLen,right-l+1);
            }
            else{
                while(sum>k){
                    sum=sum-a[l];
                    l++;
                }
            }
            right++;

        }
        System.out.println(maxLen);
    }
}
