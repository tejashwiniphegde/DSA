class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;
        while(target>1){
            if(target%2 ==0 && maxDoubles>0){
                target/=2;
                maxDoubles--;
            }
            else if(maxDoubles==0){
                moves+=target-1;
                break;
            }
            else{
                target--;
            }
            moves++;
        }
        return moves;
    }
}