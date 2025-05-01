class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int p1=0;
        int p2=numbers.length-1;
        while(p1<p2){
            int sum = numbers[p2]+numbers[p1];
            if(sum<target){
                p1++;
            }
            else if(sum>target){
                p2--;
            }
            else{
                res=new int[]{p1+1,p2+1};
                break;
            }
        }
        
        return res;
    }
}