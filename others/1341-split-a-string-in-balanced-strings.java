class Solution {
    public int balancedStringSplit(String s) {
        int r=0;
        int l = 0;
        int ans = 0;
        for(char str : s.toCharArray()){
            if(str == 'R'){
                r++;
            }
            else if(str == 'L'){
                l++;
            }
            if(r==l){
                ans+=1;
                r=0;
                l=0;
            }
        }
        return ans;
    }
}