class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        int len=nums.length;
        int min=(int)(len/3)+1;
        HashMap<Integer,Integer>res=new HashMap<>();
        for(int i=0;i<len;i++){
            int value=res.getOrDefault(nums[i],0);
            res.put(nums[i],value+1);
            if(res.get(nums[i])==min){
                arr.add(nums[i]);
            }

            if(arr.size()==2){
                break;
            }
        }
        return arr;

    }
}