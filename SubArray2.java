 public class SubArray2{
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,4,2,3};
        int t=3;
        int l=0;
        for(int i=0;i<a.length;i++) {
            int s=0;
            for(int j=i;j<a.length;j++){
               s=s+a[j];
               if(s==t){
                l=Math.max(l,j-i+1);
            }
        }
    }
    System.out.println(l);
    }
}
