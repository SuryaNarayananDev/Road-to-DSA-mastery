class Solution {
    public String largestOddNumber(String num) {
        
        if(num.length()==0) return num;
        for(int i=num.length()-1;i>=0;i--){
            char n=num.charAt(i);
            if ((n - '0') % 2 != 0)
                return num.substring(0,i+1);
        }
        return "";
    }
}