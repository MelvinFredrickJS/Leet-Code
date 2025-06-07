class Solution {
    public static void rev(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        k = k % n;            // Handle k > n
        if (k == 0) return;   // No need to rotate

        // Step 1: Reverse the whole array
        rev(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        rev(nums, 0, k - 1);

        // Step 3: Reverse the rest
        rev(nums, k, n - 1);
    }
}
