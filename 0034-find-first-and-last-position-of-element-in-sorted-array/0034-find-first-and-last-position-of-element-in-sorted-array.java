class Solution {
    public int fi(int []nums,int target){
        int firstindex=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                firstindex=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return firstindex;
    }
    public int lastindex(int []nums,int target){
        int last_i=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last_i=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last_i;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=fi(nums,target);
        int last=lastindex(nums,target);
        int arr[]=new int [2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}