class Solution {
    public int fin(int arr[],int div){
        int len=arr.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int low=0;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int res=fin(nums,mid);
            if(res<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}