public class Qsort {
    public static int partiton(int a[],int low,int high){
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j){
            while(a[i]<=pivot && i<high){
                i++;
            }
            while(a[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int t=a[low];
        a[low]=a[j];
        a[j]=t;
        return j;
    }
    public static void quicksort(int a[],int low,int high){
        if(low<high){
            int pindex=partiton(a,low,high);
            quicksort(a,low,pindex-1);
            quicksort(a,pindex+1,high);
        }
    }
    public static void main(String[] args) {
        int a[]={7,6,5,4,3,2,1};
        quicksort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
