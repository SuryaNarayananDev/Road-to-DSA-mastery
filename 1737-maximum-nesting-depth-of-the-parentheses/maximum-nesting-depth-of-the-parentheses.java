class Solution {
    public int maxDepth(String s) {
        int count=0;
        int result=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
                if(count>result){
                    result=count;
                }
            }else if(ch==')'){
                count--;
            }
        }
        return result;
    }
}