class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == target){
                index = i;
                break;
            }
            else if(target < nums[0]){
                index = 0;
                break;
            }
            else if(target>nums[nums.length-1]){
                index = nums.length;
                break;
            }
            else if(i>0 && nums[i-1]< target && target< nums[i]){
                index =i;
                break;
            }
        }
        return index;
    }
}