public class QuickSort {
    public static int partition(int a[],int low,int high) {
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<high-1 && a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            int temp2=a[low];
            a[low]=a[j];
            a[j]=temp2;

        }
        return j;
    }
    public static void quicksort(int a[],int low,int high) {
        if(low<high){
           int pindex=partition(a,low,high);
           quicksort(a,low,pindex-1);
           quicksort(a,pindex+1,high);

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={7,6,5,4,3,2,1};
        quicksort(a,0,a.length-1);
    }
}
