class Solution {
    public void rev(int start,int stop, int arr[]){
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
      if(len==0) return ;
      if(k>len){
        k%=len;
      }  
      rev(0,len-1,nums);
      rev(0,k-1,nums);
      rev(k,len-1,nums);
    }
}