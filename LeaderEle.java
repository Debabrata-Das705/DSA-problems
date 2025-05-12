public class LeaderEle {
    public static void main(String[] args) {
        int a[]={1,2,5,3,1,2};
        int b[];
        int max=-9999;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                System.out.println(max);
            }
        }
    }
}
