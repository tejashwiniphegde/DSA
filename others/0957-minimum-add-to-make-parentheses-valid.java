class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack= new Stack<Character>();
        for(char str : s.toCharArray()){
            if(str==')'&& !stack.isEmpty()&&stack.peek()=='('){
                stack.pop();
            }
            else{
                stack.push(str);
            } 
        }
        return stack.size();
    }
}