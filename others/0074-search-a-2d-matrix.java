class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        while(row<matrix.length){
            if(target>= matrix[row][0] && target<=matrix[row][matrix[row].length-1]){
                for(int n: matrix[row]){
                    if(n == target){
                        return true;
                    }
                }
            }
            row++;
        }
        return false;
    }
}