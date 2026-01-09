class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>res=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res.add(nums[i]);
            }
        }
        int j=0;
        for(int i:res){
            nums[j]=i;
            j++;
        }
        for(int i=res.size();i<nums.length;i++){
            nums[i]=0;
        }
    }
}