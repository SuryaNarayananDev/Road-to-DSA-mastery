class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=0,e=Arrays.stream(piles).max().orElse(0);
        while(s<=e){
            int mid=s+(e-s)/2;
            int total=func(piles,mid);
            
            if(total<=h) e=mid-1;
            else s=mid+1; 
        }
        return s;
    }

    static int func(int[] arr,int hour){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.ceil((double)(arr[i])/(double)(hour));
        }
        return total;
    }
}