public class KadensAlgo {
    public static void MaxSubArr(int []a){
        int max=-999;
        int sum=0;
        int start=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if (sum==0){
               // start=i;
            }
            if(sum<0){
                sum=0;
            }
            
            if(sum>max){
                max=sum;
               // System.out.println("Index :"+start+" to index :"+i);
            }
        }
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        MaxSubArr(a);

    }
}
