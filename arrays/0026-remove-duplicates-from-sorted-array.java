class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            int j = i;
                while(j<nums.length){
                    if(nums[i-1] == nums[j]){
                        nums[j] = Integer.MAX_VALUE;
                        j++;
                    }
                    else{
                        i=j;
                        break;
                    }
                }

            }

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == Integer.MAX_VALUE){
                break;
            }
            k++;
        }
    
        return k;
        }
    }
