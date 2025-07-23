class Solution {
    public void rev(int arr[],int start, int stop){
        while(start<=stop){
            int temp=arr[start];
            arr[start]=arr[stop];
            arr[stop]=temp;
            start++;
            stop--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(len==0)return;
        if(k>len){
            k=k%len;
        }
        if(k==0)return;

        rev(nums,0,len-1);
        rev(nums,0,k-1);
        rev(nums,k,len-1);
    }
}