class Solution {
    public int majorityElement(int[] nums) {
        int candiate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candiate=nums[i];
            }
            count+=(nums[i]==candiate)?1:-1;
        }
        return candiate;
    }
}