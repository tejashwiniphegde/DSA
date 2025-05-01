class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                hset.remove(nums[i-k-1]);
            }
            if(hset.contains(nums[i])){
                return true;
            }
            hset.add(nums[i]);

        }
        return false;
    }
}