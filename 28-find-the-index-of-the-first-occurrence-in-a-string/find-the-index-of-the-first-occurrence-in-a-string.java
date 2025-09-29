class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==needle.length())
            return haystack.equals(needle) ? 0 : -1;
        int pos=haystack.length()-needle.length();
        int index=-1;
        for(int i=0;i<=pos;i++){
            boolean match = true;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    match=false;
                    break;
                }
            }
            if(match){
                index=i;
                break;
            }
        }

        return index;
    }
}