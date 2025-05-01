class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,new CompareBoxes());
        int maxUnits = 0;
        for(int i =0;i<boxTypes.length;i++){
            if(boxTypes[i][0]<=truckSize){
                maxUnits+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                maxUnits+=((double)((truckSize*boxTypes[i][0])/boxTypes[i][0]))*boxTypes[i][1];
                truckSize-=truckSize;
            }
            System.out.print(maxUnits);
        }
        return maxUnits;
    }
}

class CompareBoxes implements Comparator <int[]>{
    public int compare(int[] boxType1, int[] boxType2){
        return boxType2[1] > boxType1[1] || boxType2[1] == boxType1[1]? 1:-1;
    }
}