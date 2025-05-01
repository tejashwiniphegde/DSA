class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1); 
        }

        for(int i=0;i<t.length();i++){
           Integer n = h.getOrDefault(t.charAt(i),0);
           if(n==0){
            return false;
           }
           h.put(t.charAt(i),h.getOrDefault(t.charAt(i),0)-1);  
        }

        return true;

    }
}