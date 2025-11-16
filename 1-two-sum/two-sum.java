class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    
     HashMap<Integer,Integer> sets = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(sets.containsKey(complement))
                return new int[]{ sets.get(complement) , i};

            sets.put(nums[i] , i);
        }
    return new int[]{-1,-1};
    }
}