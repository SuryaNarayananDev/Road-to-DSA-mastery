class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r=arr.length;
        int c=arr[0].length;
        int s=0,e=(r*c)-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int midr=mid/c;
            int midc=mid%c;
            if(arr[midr][midc]==target)
                return true;
            else if(arr[midr][midc]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}