class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder sb=new StringBuilder();
       int count=0;
       for(char ele:s.toCharArray()){
        if(ele=='('){
            count++;
            if(count>1){
                sb.append(ele);
            }
        }else{
            count--;
            if(count>0){
                sb.append(ele);
            }
        }
       }
       return sb.toString();
    }
}