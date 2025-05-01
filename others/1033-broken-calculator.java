class Solution {
    public int brokenCalc(int startValue, int target) {
        int op=0;
        while(target>startValue){
            op++;
            if(target%2==0){
                target/=2;
            }
            else{
                target++;
            }
        }
        return op+startValue-target;
    }
}