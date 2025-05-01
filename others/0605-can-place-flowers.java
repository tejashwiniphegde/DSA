class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean adjacent = false;
        int i=0;
        while(n>0 && i<flowerbed.length){
            if((flowerbed[i]==0)){
                if((i+1<flowerbed.length && flowerbed[i+1]==0) || i == flowerbed.length-1){
               n--;
               flowerbed[i]=1;
               i+=2;
               continue;

            }
            else{
                i+=3;
                continue;
            }
               
            }
            else{
                i+=2;
                continue;
            }
        }
        return n==0;
    }
}