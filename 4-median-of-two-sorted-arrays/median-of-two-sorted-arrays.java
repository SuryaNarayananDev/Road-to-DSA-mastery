class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int ans[]=new int[m+n];
       int i=0,j=0,k=0;
       while(i<n&&j<m){
        if(i<n&&nums1[i]<nums2[j]){
            ans[k++]=nums1[i++];
        }else{
            ans[k++]=nums2[j++];
        }
       }

       while(i<n){
        ans[k++]=nums1[i++];
       }

       while(j<m){
        ans[k++]=nums2[j++];
       }
        int length=ans.length;
       if(ans.length%2!=0) return(double)ans[length/2];
       else return (double) (ans[length / 2 - 1] + ans[length / 2]) / 2.0;
    }
}