class Solution {
    public boolean isArraySpecial(int[] nums) {
        int flage=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2==0){
                if(nums[i+1]%2==0){
                    flage=1;
                }
            }else if(nums[i+1]%2!=0){
                flage=1;
            }
        }
        if(flage==0){
            return true;
        }else{
            return false;
        }
    }
}