class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int c=0;c<s.length();c++){
            hmap.put(s.charAt(c),hmap.getOrDefault(s.charAt(c),0)+1);
        }
        int length=0;
         for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            if(entry.getValue()%2==0){
                length+=2;
            }
            else{
                length+=1;
            }
        }
        return length;
    }
}