class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int j=0;
        for(int i=0;i<2*nums.length;i++){
            ans[i] = nums[j];
            if(j == nums.length-1){
                j = -1;
            }
            j++;
        }
        return ans;
    }

}