class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int[] C = new int[A.length];
        for(int i=0;i<A.length;i++){
            list1.add(A[i]);
            list2.add(B[i]);
            List<Integer> intersection = new ArrayList<>(list1);
            intersection.retainAll(list2);
            C[i] = intersection.size();
        }
        return C;
    }
}