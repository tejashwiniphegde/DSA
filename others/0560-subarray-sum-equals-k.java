class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap();
        int sum = 0;
        int freq = 0;
        h.put(0,1);
        for(int num : nums){
            sum+=num;
            if(h.containsKey(sum-k)){
                freq+= h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return freq;
    }
}