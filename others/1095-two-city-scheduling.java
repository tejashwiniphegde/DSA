class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int[][] diff = new int[costs.length][3];
        for(int i=0;i<costs.length;i++){
            diff[i] = new int[]{costs[i][0] - costs[i][1],costs[i][0],costs[i][1]};
        }
        Arrays.sort(diff,(d1,d2)->d1[0]-d2[0]);
        int res = 0;
        for(int i=0;i<diff.length;i++){
            if(i>=diff.length/2){
                res+=diff[i][2];
            }
            else{
                res+=diff[i][1];
            }
            System.out.println(res);
        }
        return res;
    }
}