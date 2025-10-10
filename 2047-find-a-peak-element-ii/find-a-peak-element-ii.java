class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int s=0,e=c-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int row=maxElement(arr,mid);
            int left=mid-1>=0?arr[row][mid-1]:-1;
            int right=mid+1<c?arr[row][mid+1]:-1;
            if(left<arr[row][mid]&&arr[row][mid]>right)
                return new int[]{row,mid};
            else if(arr[row][mid]<right)
                s=mid+1;
            else
                e=mid-1;
        }
        return new int[]{-1,-1};
    }

    int maxElement(int[][] arr,int col){
        int max=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]>max){
                max=arr[i][col];
                index=i;
            }
        }
        return index;
    }
}