class Solution {
    public String removeOccurrences(String s, String part) {
        boolean present = true;
        while(present){
            int index = s.indexOf(part);
            if(index<0){
                break;
            }
            s = s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }
}