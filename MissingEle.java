public class MissingEle {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,4,5};
        int hash[]={0,0,0,0,0,0};
        for(int i=0;i<n-1;i++){
            hash[arr[i]]=1;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==0){
                System.out.println(i);
            }
        }
    }
}
