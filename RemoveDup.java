public class RemoveDup {
    public static void main(String[] args) {
        int a[]={4,7,7,3,2,5,5};
        int b[];
        int count=0;
        for(int i=0;i<b.length;i++){
            int temp=a[count];
            if(temp!=b[i]){
                b[count]=temp;
                count++;
            }
        }
    }
}
