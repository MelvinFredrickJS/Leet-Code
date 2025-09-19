class Solution {
    public int pivotIndex(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max+=nums[i];
        }
        int leftsum=0;
        int rightsum=max;
        for(int j=0;j<nums.length;j++){
            rightsum-=nums[j];
            if(rightsum==leftsum){
                return j;
            }
            leftsum+=nums[j];
        }
        return -1;
    }
}