public class StockBuySell {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int min=a[0];
        int profit=0;
        for(int i=1;i<a.length;i++){
            int cost=a[i]-min;
            profit=Math.max(cost,profit);
            min=Math.min(a[i],min);
        }
        System.out.println(profit);
    }
}
