class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        int commonLength = common.length();
        for(int j=1; j<strs.length;j++){
            int length = 0;
            for(int i=0;i<strs[j].length();i++){
                if(i<common.length() && strs[j].charAt(i) == common.charAt(i)){
                    length+=1;
                }
                else{
                    break;
                }
            }
            commonLength = Math.min(length,commonLength);
        }
        System.out.print(commonLength);
        return common.substring(0,commonLength);
    }
}