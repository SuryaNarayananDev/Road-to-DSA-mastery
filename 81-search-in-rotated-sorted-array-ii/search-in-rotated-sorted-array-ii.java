class Solution {
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while( start <= end ){
            int mid = start + ( end - start ) / 2;
            // if ans is found
            if( nums[mid] == target ) return true;
            
            //  edge case duplicate elements are reduce
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start+=1;
                end-=1;
                continue;
            }

            //  find which part of array is sorted 
            if(nums[start]<=nums[mid]){
                // if leftpart is sorted come into this condition
                if(nums[start]<=target&&target<=nums[mid])
                    end=mid-1;
                else 
                    start=mid+1;
            }else{
                // if right part is sorted come into this condition
                if(nums[mid]<=target&&target<=nums[end])
                    start=mid+1;
                else 
                    end=mid-1; 
            }
        }
        return false;
    }
}