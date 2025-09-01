class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstnum=Integer.MAX_VALUE;
        int secnum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=firstnum){
                firstnum=nums[i];
            }else if(nums[i]<=secnum){
                secnum=nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}