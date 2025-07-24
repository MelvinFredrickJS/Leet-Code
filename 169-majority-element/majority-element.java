class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>res=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            int value=res.getOrDefault(nums[i],0);
            res.put(nums[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it:res.entrySet()){
            if(it.getValue()>(len/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}