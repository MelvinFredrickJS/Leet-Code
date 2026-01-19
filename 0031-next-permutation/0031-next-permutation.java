class Solution {
    public void reverse(int arr[],int start,int stop){
        while(start<stop){
            int temp=arr[start];
           arr[start]=arr[stop];
           arr[stop]=temp;
            start++;
            stop--;
        }}
        public void swap(int arr[],int start,int stop){
            int temp=arr[start];
            arr[start]=arr[stop];
            arr[stop]=temp;
        }
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
    }
}