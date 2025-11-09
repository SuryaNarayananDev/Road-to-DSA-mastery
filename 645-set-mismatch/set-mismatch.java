class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        // int[] miss=new int[2];
        while(i<nums.length){
            int cor=nums[i]-1;
            if(nums[i]!=nums[cor]){
                swap(nums,i,cor);
            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}