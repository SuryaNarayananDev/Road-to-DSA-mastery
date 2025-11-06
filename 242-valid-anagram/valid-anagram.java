class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
 
        int[] arr1=new int[26];
        int i=0;
        while(i<s.length()){
            arr1[s.charAt(i)-'a']++;
            arr1[t.charAt(i)-'a']--;
            i++;
        }
        for(i=0;i<26;i++){
            if(arr1[i]!=0) return false;
        }
        return true;
    }
}