class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr = new ArrayList<>();

        for(int[] interval : intervals){
            if(newInterval[1]<interval[0]){
                arr.add(newInterval);
                newInterval = interval;
            }
            else if(interval[1]<newInterval[0]){
                arr.add(interval);
            }
            else{
                newInterval[0] = Math.min(interval[0],newInterval[0]);
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }

        arr.add(newInterval);

        return arr.toArray(new int[arr.size()][2]);

    }
}