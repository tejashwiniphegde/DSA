class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0){
            return false;
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        Arrays.sort(nums);
        for(int n:nums){
            hmap.put(n,hmap.getOrDefault(n,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i])>0){
                for(int j=0;j<k;j++){
                    int cur = hmap.getOrDefault(nums[i]+j,0);
                    if(cur<=0){
                        return false;
                    }
                    hmap.put(nums[i]+j,cur-1);
                }
            }
        }
        return true;
    }
}