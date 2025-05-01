class Solution {
    public int maximumSwap(int num) {
        String numString = Integer.toString(num);
        List<Character> list = new ArrayList<>();
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<numString.length();i++){
            list.add(numString.charAt(i));
            hmap.put(numString.charAt(i),i);
        }
        Collections.sort(list,Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder(numString);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==sb.charAt(i)){
                continue;
            }
            int ind = hmap.get(list.get(i));
            sb.setCharAt(ind,sb.charAt(i));
            sb.setCharAt(i,list.get(i));
            break;

        }
        return Integer.parseInt(sb.toString());

        
    }
}