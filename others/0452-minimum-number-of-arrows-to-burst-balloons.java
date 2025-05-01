class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int start = points[0][0];
        int end = points[0][1];
        int shots = points.length;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=end){
                start = Math.max(start,points[i][0]);
                end = Math.min(end,points[i][1]);
                shots-=1;
                System.out.print(shots);
            }
            else{
                start = points[i][0];
                end = points[i][1];
            }
        }
        return shots;
    }
}