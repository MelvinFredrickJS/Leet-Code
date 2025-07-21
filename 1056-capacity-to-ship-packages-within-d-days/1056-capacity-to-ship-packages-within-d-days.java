class Solution {
    public int cal(int arr[],int capacity){
        int day=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=capacity){
                load+=arr[i];
            }else{
                day+=1;
                load=arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int len=weights.length;
        for(int i=0;i<len;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int day=cal(weights,mid);
            if(day<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}