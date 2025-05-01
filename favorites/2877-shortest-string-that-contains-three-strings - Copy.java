class Solution {
    public String minimumString(String a, String b, String c) {
        int length=Integer.MAX_VALUE;
        String ans = "";
        for(String s : new String[]{
            merge(merge(a,b),c),
            merge(merge(b,a),c),
            merge(merge(c,a),b),
            merge(merge(a,c),b),
            merge(merge(b,c),a),
            merge(merge(c,b),a),
        }){
            if(s.length()<length){
                ans = s;
                length=s.length();
            }else if(s.length()==length){
                ans = ans.compareTo(s) <0 ? ans : s;
            }
           
        }
         return ans;
    }
    public String merge(String s1, String s2){
        if(s1.contains(s2)) return s1;
        for(int i=0;i<s1.length();i++){
            if(s2.startsWith(s1.substring(i))) return s1.substring(0,i)+s2;
        }
        return s1+s2;
    }
}