class Solution {
    public String convert(String s, int numRows) {
        String[] str = new String[numRows];
        Arrays.fill(str,"");
        String res ="";
        int j=0;
        while(j<s.length()){
            int i=0;
            while(i<numRows && j<s.length()){
                str[i++] += s.charAt(j++);
            }
            i--;
            while(i>1 && j<s.length()){
                str[--i] +=  s.charAt(j++);
            }
        }
        for(String s1: str){
            res+=s1;
        }
    return res;
        
    }
}