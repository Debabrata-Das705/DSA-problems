public class MatrixCon {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{1,0,1},{1,1,1}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int count=0;
        int max=0;
        int maxrow=0;
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=0;j<a.length;j++){
                if(a[i][j]==1){
                    count++;
                }
                if(count>=max){
                   // max=count;
                    maxrow=i+1;
                   
                }
              }
         }
        
    }
}
