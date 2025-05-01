class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()==1)
            return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else{
                if(stack.size()!=0){
                char popedele = stack.peek();
                if((s.charAt(i)==')' && popedele=='(') || (s.charAt(i)=='}'&&popedele=='{') || (s.charAt(i)==']'&& popedele=='[')){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
                }
                else
                    return false;

            }
        }
        if(stack.size()==0)
            return true;
        return false;
    }
}