public class DelElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int index=3;
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
           
        }
        System.out.println();
        for(int i=index;i<a.length;i++){
           
                a[i-1]=a[i];

           
            
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
