class Solution {
    public int jump(int[] nums) {
        int end=0;
        int current =0;
        int jump = 0;
        for(int i=0;i<nums.length-1;i++){
            end = Math.max(end,nums[i]+i);
            if(i==current){
                current=end;
                jump++; 
            }
        }
        return jump;


    }
}