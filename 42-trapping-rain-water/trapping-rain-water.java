class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int n = height.length;
        int lb = 0, rb = 0;
        int start = 0, end = n - 1;
        int sum = 0;

        while (start <= end) {
            if (height[start] <= height[end]) {
                if (height[start] > lb) {
                    lb = height[start];
                } else {
                    sum += lb - height[start];
                }
                start++;
            } else {
                if (height[end] > rb) {
                    rb = height[end];
                } else {
                    sum += rb - height[end];
                }
                end--;
            }
        }

        return sum;
    }
}
