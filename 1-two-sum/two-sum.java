class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>res=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int more=target-nums[i];
            if(res.containsKey(more)){
                return new int[]{res.get(more),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{-1-1};
    }
}