class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        int score = 0;
        while(pq.size()>1){
           int s1= pq.poll();
           int s2 =  pq.poll();
           s1--;
           s2--;
           score++;
           if(s1!=0){
            pq.offer(s1);
           }
           if(s2!=0){
            pq.offer(s2);
           }
        }
        return score;
    }
}