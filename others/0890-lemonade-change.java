class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int twenty = 0;
        for(int bill : bills){
            int change = 0;
            if(bill==5){
                fives +=1;
            }
            else if(bill==10){
                tens+=1;
                fives-=1;
            }
            else{
                twenty+=1;
                fives-=1;
                if(tens!=0){
                    tens-=1;
                }
                else{
                    fives-=2;
                }
                
            }
            System.out.println(fives);
            System.out.println(tens);
            System.out.println(twenty);
            if(fives<0 || tens<0 || twenty<0){
                return false;
            }
        }
        return true;
    }
}