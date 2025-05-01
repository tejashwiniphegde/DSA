class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closeSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0;i<=nums.length-2;i++){
            int left = i+1;
            int right=nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-closeSum)){
                    closeSum = sum;
                }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closeSum;
    }
}