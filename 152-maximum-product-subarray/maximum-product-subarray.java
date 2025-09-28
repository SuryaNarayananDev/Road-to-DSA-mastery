class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
           int num = nums[i], tempMax = max;
            max = Math.max(num, Math.max(num * max, num * min));
            min = Math.min(num, Math.min(num * tempMax, num * min));
            res = Math.max(res, max);
        }
        return res;
    }
}