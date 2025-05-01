class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            if(String.valueOf(boxes.charAt(i)).equals("1")){
                list.add(i);
            }
        }
        int j=0;
        while(j<boxes.length()){
            for(int k=0;k<list.size();k++){
                ans[j] += Math.abs(list.get(k)-j);
            }
            j++;
        }
        return ans;
    }
}