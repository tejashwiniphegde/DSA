class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashMap<Integer,List<Integer>> h = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(h.getOrDefault(groupSizes[i],new ArrayList()).size()<groupSizes[i]){
                List<Integer> list =h.getOrDefault(groupSizes[i],new ArrayList());
                list.add(i);
                h.put(groupSizes[i],list);
            }
            else{
                res.add(h.get(groupSizes[i]));
                h.put(groupSizes[i],new ArrayList<>(Arrays.asList(i)));
            }
        }
        h.forEach((key, value) -> res.add(value));
        return res;
    }
}