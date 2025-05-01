class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long swaps=0;
        int min=basket1[0];
        for(int b:basket1){
            if(b<min){
                min =b;
            }
            map.put(b,map.getOrDefault(b,0)+1);
        }
        for(int b:basket2){
            if(b<min){
                min = b;
            }
            map.put(b,map.getOrDefault(b,0)-1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            if(val%2!=0){
                return -1;
            }
            for(int i=0;i<Math.abs(val/2);i++){
                list.add(key);
            }
        }
        Collections.sort(list);
        for(int j=0;j<list.size()/2;j++){
            swaps+=Math.min(list.get(j),2*min);
        }
        return swaps;
    }
}