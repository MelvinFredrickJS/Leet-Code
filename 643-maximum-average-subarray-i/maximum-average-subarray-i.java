class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return(double)nums[0];
        }else{
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        int start=0;
        int end=k;
        while(end<nums.length){
            sum-=nums[start];
            start++;
            sum+=nums[end];
            end++;
            max=Math.max(sum,max);
        }
        return (double)max/k;
        }
    }
}