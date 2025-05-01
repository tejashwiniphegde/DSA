class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int right = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            right = i;
            if (map.containsKey(s.charAt(i))){
                while(map.containsKey(s.charAt(i))){
                    map.remove(s.charAt(left));
                    left+=1;
                }
            }
            System.out.println(left);
            System.out.println(right);
            map.put(s.charAt(i),1);
            res = Math.max(res,right-left+1);
        }
        return res;
    }

}