class Solution {
    public int splitArray(int[] nums, int k) {
        int start=Arrays.stream(nums).max().getAsInt();
        int end=Arrays.stream(nums).sum();
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(nums,k,mid)){
                res=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return res;
    }

    boolean possible(int[] arr,int k,int limit){
        int chunks=1;
        int count=0;
        for(int ele:arr){
            if(count+ele>limit){
                chunks++;
                if(chunks>k) return false;
                count=0;
            }
            count+=ele;
        }
        return chunks<=k;
    }
}