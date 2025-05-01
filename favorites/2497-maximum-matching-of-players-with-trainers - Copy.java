class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=0;
        int ans=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}