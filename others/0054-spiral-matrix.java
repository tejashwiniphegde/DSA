class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        ArrayList arr = new ArrayList<Integer>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            left+=1;
          
            
            for(int i=top+1;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            top+=1;
            
            if(top>bottom || left>right)
                break;

            for(int i=right-1;i>left-1;i--){
                arr.add(matrix[bottom][i]);
            }
            right-=1;
            
            for(int i=bottom;i>top-1;i--){
                arr.add(matrix[i][left-1]);
            }
            
            bottom-=1;
            System.out.print(arr);
            System.out.print(left);
            System.out.print(top);
            System.out.print(bottom);
            System.out.print(right);
        }
        return arr;
    }
}