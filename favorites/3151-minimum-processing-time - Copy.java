class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime,Collections.reverseOrder());
        int ans = 0;
        int c=0;
        for(int p : processorTime){
            int count=0;
            for(int i=c;i<tasks.size();i++){
                if(count>=4){
                    break;
                }
                ans = Math.max(ans,p+tasks.get(i));
                System.out.println(ans);
                c++;
                count++;
            }
        }
        return ans;
    }
}