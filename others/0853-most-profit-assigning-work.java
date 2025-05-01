class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] diffProfit = new int[difficulty.length][2];
        int Maxprofit=0;
        for(int i=0;i<difficulty.length;i++){
            diffProfit[i] = new int[]{difficulty[i],profit[i]};
        }
        Arrays.sort(diffProfit,(a,b)-> b[1] - a[1]);
        for(int w:worker){
            for(int[] diff : diffProfit){
                if(diff[0]<=w){
                    Maxprofit+=diff[1];
                    break;
                }
            }
        }
        return Maxprofit;
    }
}