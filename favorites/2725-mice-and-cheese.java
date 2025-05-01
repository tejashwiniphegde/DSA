class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<reward2.length;i++){
            ans+=reward2[i];
        }
        for(int r=0;r<reward1.length;r++){
            pq.offer(reward1[r]-reward2[r]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
    }
}