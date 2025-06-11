class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posind=0;
        int negind=1;
        int len=nums.length;
        int res[]=new int[len];
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                res[posind]=nums[i];
                posind+=2;
            }else if(nums[i]<0){
                res[negind]=nums[i];
                negind+=2;
            }
        }
        return res;
    }
}