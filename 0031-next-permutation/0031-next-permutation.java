class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int len=nums.length;
        for(int i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            int left=0;
            int right=len-1;
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }else if(ind!=-1){
            for(int i=len-1;i>ind;i--){
                if(nums[i]>nums[ind]){
                    int temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }

            int left=ind+1;
            int right=len-1;
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        
    }
}