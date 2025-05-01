class Solution {
    public String removeDuplicateLetters(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       HashSet<Character> letters = new HashSet<>();
       Stack<Character> stack = new Stack<>();

       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),i);
       }

       for(int i=0;i<s.length();i++){
        if(!letters.contains(s.charAt(i))){
            while(!stack.isEmpty() && s.charAt(i)<stack.peek() && i<map.get(stack.peek()))       {
                Character popedEle = stack.pop();
                letters.remove(popedEle);
            }
            stack.push(s.charAt(i));
            letters.add(s.charAt(i));
        }
       }
       StringBuilder sb = new StringBuilder();
       while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
       }
       return sb.toString();

    }
}