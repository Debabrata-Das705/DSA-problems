public class MissingEleOptimal {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,4,5};
        int s1=n*(n+1)/2;
        int s2=0;
        for(int i=0;i<arr.length;i++){
             s2=s2+arr[i];
        }
        System.out.println(s1-s2);
    }
}
