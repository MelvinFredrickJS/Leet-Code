class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int num=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int sum=num+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}