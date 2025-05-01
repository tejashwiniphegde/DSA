class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int[] seats:reservedSeats){
            map.putIfAbsent(seats[0],new ArrayList<>());
            map.get(seats[0]).add(seats[1]);
        }

        int ans = 2*(n-map.size());
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            boolean left = false;
            boolean middle = false;
            boolean right = false;
            for(int seat :entry.getValue()){
                if(seat>=2 && seat<=5){
                    left=true;
                }
                if(seat>=4 &&seat<=7){
                    middle=true;
                }
                if(seat>=6 && seat<=9){
                    right = true;
                }
                if(left&&right&&middle){
                    break;
                }
            }
            if(!left){
                ans+=1;
            }
            if(!right){
                ans+=1;
            }
            if(left&&right&&!middle){
                ans+=1;
            }
        }
        return ans;

    }
}