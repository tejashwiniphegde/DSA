class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int low = 0;
        int score=0;
        int high = tokens.length-1;
        while(low<=high){
            if(power>=tokens[low]){
                score++;
                power-=tokens[low];
                low++;
            }
            else if(score>=1 && low<high && power<tokens[low]){
                score--;
                power+=tokens[high];
                high--;
            }
            else{
                low++;
                high--;
            }
            System.out.println(power);
        }
        return score;
    }
}