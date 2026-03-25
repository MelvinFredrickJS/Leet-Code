class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                pointer=i;
                break;
            }
        }
        if(pointer==-1){
            
            return;
        }
        for(int j=pointer+1;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[pointer];
                nums[pointer]=temp;
                pointer++;
            }
        }
    }
}