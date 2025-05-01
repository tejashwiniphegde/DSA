class Solution {
    public int minIncrementForUnique(int[] nums) {
        int i=0;
        int moves=0;
        Arrays.sort(nums);
        for(int num:nums){
            int maxi = Math.max(num,i);
            moves+=maxi-num;
            i=maxi+1;
        }
        return moves;
    }
}