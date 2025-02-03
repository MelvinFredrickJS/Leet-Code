class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int size=nums.length;
        int longest=1;
        int incre=1;
        int decre=1;
        for(int i=1;i<size;++i){
            if(nums[i]<nums[i-1]){
                decre++;
            }else{
                decre=1;
            }
            if(nums[i]>nums[i-1]){
                incre++;
            }else{
                incre=1;
            }
            longest=Math.max(longest,Math.max(incre,decre));

        }
        return longest;
        
    }
}