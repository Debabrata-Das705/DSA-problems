public class SubArrayOptm {
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,1,3,3};
        int l=0;
        int r=0;
        int sum=a[r];
        int k=6;
        int len=0;
        while(r<a.length){
            while(l<=r && sum>k){
                sum=sum-a[l];
                l++;
            }
            if(sum==k){
                len=Math.max(len,r-l+1);
            }
           r++;
           if(r<a.length){
            sum=sum+a[r];
           }
    }
    System.out.println(len);
}
}
