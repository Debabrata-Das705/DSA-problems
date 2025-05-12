public class MaxConsicutiveone {
    public static void main(String[] args) {
        int a[]={0,1,1,0};
        int count =0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
            if(a[i]!=1){
                count=0;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
