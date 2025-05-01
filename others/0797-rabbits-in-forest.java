class Solution {
    public int numRabbits(int[] answers) {
        int rabbit =0;
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int ans : answers){
            if(ans==0){
                rabbit++;
            }
            else if(hmap.getOrDefault(ans,0)==0){
               hmap.put(ans,1);
                rabbit+=ans+1;
            }
            else{
                hmap.put(ans,hmap.get(ans)+1);
                if(hmap.get(ans)>ans){
                    hmap.put(ans,0);
                }
            }
        }
        return rabbit;
    }
}