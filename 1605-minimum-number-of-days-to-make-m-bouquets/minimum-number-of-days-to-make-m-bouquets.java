class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //  check Enough day and flower to make Bouquets
         if ((long) m * k > bloomDay.length) return -1;

        int s=Integer.MAX_VALUE,e=Integer.MIN_VALUE;
        // find the range of day to start and end (min & max) 
        for(int i=0;i<bloomDay.length;i++){
            if(e<bloomDay[i]) e=bloomDay[i];
            if(s>bloomDay[i]) s=bloomDay[i];
        }
        // BS algo for find the Day
        while(s<=e){
            int mid=s+(e-s)/2;
            //  Check that day can make Bouquets ?
            if(possible(bloomDay,mid,m,k))
                e=mid-1;
            else 
                s=mid+1;
        }
        return s;
    }

    boolean possible(int arr[], int day, int m, int k) {
        // check that day make create Enough Bouquets
        int bouquets = 0, flowers = 0;
        for (int bloom : arr) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {   // made one bouquet
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;          // reset streak
            }
        }
        return bouquets >= m;
    }
}