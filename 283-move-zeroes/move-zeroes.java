class Solution {
    public void swap(int a, int n, int arr[]){
        int temp=arr[a];
        arr[a]=arr[n];
        arr[n]=temp;

    }
    public void moveZeroes(int[] nums) {
        int pointer=-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                pointer=k;
                break;
            }
        }
        if(pointer==-1) return;
        for(int j=pointer+1;j<nums.length;j++){
            if(nums[j]!=0){
                swap(j,pointer,nums);
                pointer++;
            }
        }
    }
}