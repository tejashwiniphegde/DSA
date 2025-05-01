class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int boats=0;
        int j=people.length-1;
        while(i<=j){
            int sum = people[i]+people[j];
            if(sum<=limit){
                boats++;
            }
            else{
                boats++;
                j--;
                continue;
            }
            i++;
            j--;
        }
        return boats;
    }
}