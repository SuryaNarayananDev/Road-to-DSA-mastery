class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        int n=strs.length;
        while(strs[0].length()>i&&strs[n-1].length()>i){
            if(strs[0].charAt(i)==strs[n-1].charAt(i))
                i++;
            else
                break;
        }
        return strs[0].substring(0,i);
    }
}