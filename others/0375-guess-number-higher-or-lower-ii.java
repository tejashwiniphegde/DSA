class Solution {
    public int getMoneyAmount(int n) {
        Integer [] [] dp = new Integer[n+1][n+1];
        int money = getMax(1,n,dp);

        return money;
    }
    public int getMax(int start,int end,Integer[][] dp){
        if(start>end){
            return Integer.MIN_VALUE;
        }
        if(start==end){
            return 0;
        }
        if(dp[start][end]!=null){
            return dp[start][end];
        }
        int mini = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            mini = Math.min(mini,Math.max(getMax(start,i-1,dp),getMax(i+1,end,dp))+i);
        }

        dp[start][end] = mini;

        return mini;
    }
}