class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        int preint=Integer.MIN_VALUE;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if((nums[i]-1)==preint){
                count++;
                preint=nums[i];
            }else if(nums[i]!=preint){
                count=1;
                preint=nums[i];
            }

            longest=Math.max(longest,count);
        }
        return longest;
    }
}