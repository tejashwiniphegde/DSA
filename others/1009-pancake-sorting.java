class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int j=arr.length-1;
        while(j>=0){
            int max = findMax(arr,0,j);
            if(max==j){
                j--;
                continue;
            }
            flip(arr,0,max);
            list.add(max+1);
            list.add(j+1);
            flip(arr,0,j);
            j--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return list;
    }

    public int findMax(int[]arr,int start,int end){
        int max = arr[0];
        int maxi = 0;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
                maxi=i;
            }
        }
        return maxi;
    }

    public void flip(int[]arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}