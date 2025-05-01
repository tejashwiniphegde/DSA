class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int n:nums){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry : h.entrySet()){
            q.add(entry);
            if(q.size()>k){
                q.poll();
            }
        }
        int[] ans = new int[k];
        int i=0;
        while(!q.isEmpty()){
            ans[i]=q.poll().getKey();
            i++;
        }
        return ans;

        




    }
}