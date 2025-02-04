class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int start=1;
        int size=nums.length;
        int maxsum=nums[0];
        while(start<size){
            while(start<size && nums[start]>nums[start-1]){
                sum+=nums[start];
                start++;
            }
            maxsum=Math.max(sum,maxsum);
            if(start<size){
                sum=nums[start];
                start++;
            }
        }
        return maxsum;
        
    }
}