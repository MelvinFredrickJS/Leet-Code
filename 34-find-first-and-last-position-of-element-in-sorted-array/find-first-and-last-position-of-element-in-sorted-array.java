class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        int fi=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                fi=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        int li=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                li=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        res[0]=fi;
        res[1]=li;
        return res;
    }
}