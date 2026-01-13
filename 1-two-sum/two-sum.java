class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>res=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int firstelement=nums[i];
            int moreneeded=target-firstelement;
            if(res.containsKey(moreneeded)){
                return new int[]{res.get(moreneeded),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
} 