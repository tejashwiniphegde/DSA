class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(Character n : num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>n){
                stack.pop();
                k--;
            }
            stack.push(n);
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder("");
        while(!stack.isEmpty()){
            ans.insert(0,stack.pop());
        }
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.length()==0?"0":ans.toString();
    }
}