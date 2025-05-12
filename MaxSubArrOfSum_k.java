public class MaxSubArrOfSum_k {
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,1,3,3};
        int l=0,r=0,sum=0,k=6,maxarr=0;
        while(r<a.length){
            sum+=a[r];
            if(sum==k){
             maxarr=Math.max(maxarr,r-l+1);
            }
            r++;
            while(l<a.length && sum>k){
                sum-=a[l];
                l++;
            }
        }
        System.out.println(maxarr);

    }
}
