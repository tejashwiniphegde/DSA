class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = binarySearch(nums,target,true);
        if(left==-1){
            return res;
        }
        res[0] = left;
        int right = binarySearch(nums,target,false);
        res[1] = right;
        return res;
    }


    public int binarySearch(int[] nums,int target,boolean left){
        int start=0;
        int index=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid = (start+(end-start)/2);
            if(target==nums[mid]){
                index = mid;
                if(left){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
}