class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len];
        int proleft=1;
        int proright=1;
        for(int i=len-1;i>=0;i--){
            arr[i]=proright;
            proright=proright*nums[i];
        }
        for(int i=0;i<len;i++){
            arr[i]=arr[i]*proleft;
            proleft=proleft*nums[i];
        }
        return arr;
    }
}