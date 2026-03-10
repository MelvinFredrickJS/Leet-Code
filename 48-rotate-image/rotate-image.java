class Solution {
    public void swap(int a, int b, int arr[][]){
        int temp=arr[a][b];
        arr[a][b]=arr[b][a];
        arr[b][a]=temp;
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                swap(i,j,matrix);
            }
        }
        for(int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix.length-1;
            while(left<=right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}