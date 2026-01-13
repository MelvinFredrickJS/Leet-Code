class Solution {
    public void swap(int low, int high, int arr[]){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(left,mid,nums);
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(mid,right,nums);
                right--;
            }
        }
    }
}