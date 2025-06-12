class Solution {
    public void swap(int fn,int sn,int nums[]){
        int temp=nums[fn];
        nums[fn]=nums[sn];
        nums[sn]=temp;

    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            int left=0;
            int right=nums.length-1;
            while(right>=left){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            return;
        }
        for(int j=nums.length-1;j>ind;j--){
            if(nums[ind]<nums[j]){
                swap(ind,j,nums);
                break;
            }
        }
        int left=ind+1;
        int right=nums.length-1;
        while(right>=left){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        
    }
}