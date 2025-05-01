class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();

        if(nums.length==0){
            return 0;
        }
        for(int n : nums){
            h.add(n);
        }

        int longest=1;
        for(int ele:h){
            if(!h.contains(ele-1)){
                int sequence=1;
                int temp=ele;
                while(h.contains(temp+1)){
                    sequence++;
                    temp++;
                }
                longest=Math.max(longest,sequence);
            }
        }
        return longest;
    }
}