class Solution {
    public void rev(int start,int stop, int arr[]){
        while(start<stop){
            int temp=arr[start];
            arr[start]=arr[stop];
            arr[stop]=temp;
            start++;
            stop--;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            rev(0,nums.length-1,nums);
            return;
        }
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        rev(ind+1,nums.length-1, nums);
    }
}