class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String w2 : words2){
            HashMap<Character,Integer> outermap = new HashMap<>();
            for(Character w : w2.toCharArray()){
                outermap.put(w,outermap.getOrDefault(w,0)+1);
            }
            for(Map.Entry<Character,Integer> entry : outermap.entrySet()){
                hmap.put(entry.getKey(),Math.max(hmap.getOrDefault(entry.getKey(),0),entry.getValue()));
            }
        }
        for(String w1 : words1){
            HashMap<Character,Integer> innerMap = new HashMap<>();
            for(Character w: w1.toCharArray()){
                innerMap.put(w,innerMap.getOrDefault(w,0)+1);
            }
            boolean flag = true;
            for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
                if(entry.getValue() > innerMap.getOrDefault(entry.getKey(),0)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(w1);
            }
        }
        return list;
    }
}