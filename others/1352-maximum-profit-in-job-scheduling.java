class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] jobs = new int[endTime.length][3];
        for(int i=0;i<endTime.length;i++){
            jobs[i] = new int[]{startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(jobs,Comparator.comparingInt(a->a[1]));
        TreeMap<Integer,Integer> treemap = new TreeMap<>();
        int profits = 0;
        treemap.put(0,0);
        for(int i=0;i<jobs.length;i++){
            int previousProfit = treemap.floorEntry(jobs[i][0]).getValue();
            int currProfit = previousProfit+jobs[i][2];
            if(currProfit>treemap.lastEntry().getValue()){
                treemap.put(jobs[i][1],currProfit);
            }
        }
        return treemap.lastEntry().getValue();

    }
}