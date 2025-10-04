class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ele:s.toCharArray()){
            if(ele=='('||ele=='{'||ele=='[')
            stack.push(ele);
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if(ele==')'&&top!='('||ele=='}'&&top!='{'||ele==']'&&top!='[')
                return false;
            }
        }

        return stack.isEmpty();
    }
}