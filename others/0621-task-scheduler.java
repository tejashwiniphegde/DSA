class Solution {
    public int leastInterval(char[] tasks, int n) {
     int[] freq = new int[26];
     for(char task:tasks){
        freq[task-'A']++;
     }  
     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
     Queue<int[]> q = new LinkedList<>();
     for(int f : freq){
        if(f>0){
            pq.offer(f);
        }
     }
     int time = 0;
     while(!pq.isEmpty() || !q.isEmpty()){
        time+=1;
        if(!pq.isEmpty()){
            int r = pq.poll()-1;
            if(r!=0){
                q.offer(new int[]{r,time+n});
            }
            System.out.print(r);
        }
        if(!q.isEmpty() &&q.peek()[1]==time){
            pq.offer(q.poll()[0]);
        }
     }
     return time;
    }
}