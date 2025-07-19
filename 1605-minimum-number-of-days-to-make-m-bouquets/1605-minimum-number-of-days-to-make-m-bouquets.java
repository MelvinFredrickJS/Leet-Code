class Solution {
    public int check(int[] arr, int k, int day) {
        int count = 0;
        int made = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
                if (count == k) {
                    made++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return made;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int len=bloomDay.length;
        if((m*k)>len){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(bloomDay,k,mid)>=m){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}