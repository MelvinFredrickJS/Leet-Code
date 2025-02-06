class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    int []b={i,j};
                    return b;
                }
            }
        }
        return new int[]{};//this is two sum 
        
    }
}
