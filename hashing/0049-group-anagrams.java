class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<String,List<String>>();
        for(int i=0; i<strs.length;i++){
            char[] chararr = strs[i].toCharArray();
            Arrays.sort(chararr);
            String sortedString = new String(chararr);
            List currentValue = h.getOrDefault(sortedString,new ArrayList());
            currentValue.add(strs[i]);
            h.put(sortedString,currentValue);  
        }
        return new ArrayList(h.values());
    }
}