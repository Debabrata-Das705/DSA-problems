public class MoveZzeroToEnd {
    public static void Move(int a[]){
        int temp[]=new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                temp[count]=a[i];
                count++;
            }
        }
        for(int i=0;i<a.length;i++){
            a[i]=temp[i];
        }
        for(int i=count;i<a.length;i++){
            a[i]=0;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
             }
        }
    public static void main(String[] args) {
        int a[]={0,0,1,2,0,0,3,4};
        Move(a);

    }
    
}
