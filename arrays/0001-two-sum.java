class Solution {
    public int[] twoSum(int[] nums, int target) {
        int otheridx = -1;
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            otheridx = target - nums[i];
            if(map.containsKey(otheridx))
                res = new int[] {i,map.get(otheridx)};
            map.put(nums[i],i);
        }
        return res;
    }
}