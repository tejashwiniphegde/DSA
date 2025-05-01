class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if(rowIndex == 0){
            result.add(1);
            return result;
        }
        if(rowIndex == 1){
            result.add(1);
            result.add(1);
            return result;
        }
        List<Integer> prevRow = getRow(rowIndex-1);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        for(int i=1;i<prevRow.size();i++){
            currentRow.add(prevRow.get(i-1)+prevRow.get(i));
        }
        currentRow.add(1);
        return currentRow;
    }
}