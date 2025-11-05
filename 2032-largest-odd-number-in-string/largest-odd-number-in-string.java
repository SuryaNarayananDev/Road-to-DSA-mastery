class Solution {
    public String largestOddNumber(String num) {
        if(num.length()==0) return num;
        int i=num.length()-1;
        while(i>=0&&(num.charAt(i)-'0')%2==0){
            i--;
        } 
        return i==-1?"":num.substring(0,i+1);
    }
}