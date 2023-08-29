//Max profit in share market fist buy then sell
class ShareMaxProfit {
    public static int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                for(int j=i+1;j<prices.length;j++){
                    int a=prices[j]-prices[i];
                    if(a>max){
                        max=a;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        maxProfit(prices);
    }
}
