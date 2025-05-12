public class SubArray {
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,4,2,3};
        int t=2;
        int l=0;
        for(int i=0;i<a.length;i++) {
            for(int j=i;j<a.length;j++){
                int s=0;
                for(int k=i;k<=j;k++){
                    s=s+a[k];
                }
                if(s==t){
                    l=Math.max(l, j-i+1);
                }
            }
        }
        System.out.println(l);
    }
}
