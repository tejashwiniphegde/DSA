class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.isEmpty() || s.length()<k){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character str : s.toCharArray()){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int c=0;
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()%2!=0){
                c++;
            }
        }
        return c<=k;
    }
}