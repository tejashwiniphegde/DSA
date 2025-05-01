class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String,Integer> h = new HashMap<>();
        return findTarget(nums,target,0,h,0);
    }

    public int findTarget(int [] nums, int target, int i, HashMap h, int total){
        if(i == nums.length){
            return target == total? 1 : 0;
        }
        if(h.containsKey(Integer.toString(i)+"+"+Integer.toString(total))){
            return (int)h.get(Integer.toString(i)+"+"+Integer.toString(total));
        }
        int ways = findTarget(nums,target,i+1,h,total+nums[i]) + findTarget(nums,target,i+1,h,total-nums[i]);
        h.put(Integer.toString(i)+"+"+Integer.toString(total),ways);
        return ways;
    }
}