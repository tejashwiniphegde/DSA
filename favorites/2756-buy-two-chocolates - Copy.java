class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min1){
                min2=min1;
                min1=prices[i];
            }
            else if(prices[i]<min2){
                min2=prices[i];
            }
        }
        System.out.print(min1);
        System.out.print(min2);
        int ans =money-min1-min2;
        return money-min1-min2 < 0? money : ans;
    }
}