class Solution {
    public void rotate(int[][] matrix) {
        int i=0;
        int j=1;
        while(i<matrix.length){
            while(j<matrix.length){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                j++;
            }
            i++;
            j=i+1;
        }
        System.out.print(Arrays.deepToString(matrix));
        for(int k=0;k<matrix.length;k++){
            for(int l=0;l<matrix[k].length/2;l++){
                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][matrix[k].length-l-1];
                matrix[k][matrix[k].length-l-1] = temp;
            }

        }
    }
}