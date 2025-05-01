class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str+=Character.toLowerCase(c);
            }
        }
        System.out.print(str);
        int i=0;
        int j=str.length()-1;
        while(i!=j && i<j && i<str.length() && j>=0){
            System.out.print(i);
            System.out.print(j);
            if(!(str.charAt(i)==str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}