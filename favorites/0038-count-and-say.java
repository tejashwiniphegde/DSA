class Solution {
    
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n-1);
        String res="";
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),(h.get(s.charAt(i))+1));
            }
            else{
                for(Map.Entry<Character,Integer> mapElement : h.entrySet()) {
                    Character key = mapElement.getKey();
                    int value = mapElement.getValue();
                    System.out.println(key);
                    res = res+ Integer.toString(value) + key;
                }
                h.clear();
                h.put(s.charAt(i),1);
            }
        }

        if(h.size()>0){
            for(Map.Entry<Character,Integer> mapElement : h.entrySet()) {
                    Character key = mapElement.getKey();
                    int value = mapElement.getValue();
                    System.out.println(key);
                    res = res+Integer.toString(value) + key;
            }
        }
        return res;
    }
}