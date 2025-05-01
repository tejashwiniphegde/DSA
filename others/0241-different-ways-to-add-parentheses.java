class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> output= new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1,expression.length()));
            

            for(int a:left){
                for(int b:right){
                    if(expression.charAt(i)=='+') output.add(a+b);
                    if(expression.charAt(i)=='-') output.add(a-b);
                    if(expression.charAt(i)=='*') output.add(a*b);
                }
            }
        }
        }
        if(output.isEmpty())
         output.add(Integer.parseInt(expression));
        return output;
    }
}