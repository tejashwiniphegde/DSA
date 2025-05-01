class Solution {
    public String reverseWords(String s) {

        String [] splits = s.trim().split("\\s+");
        String res = "";
        for(int i=splits.length-1;i>=0;i--){
            res+=splits[i]+" ";
        }

        return res.trim();
        
    }
}