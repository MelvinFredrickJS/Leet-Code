class Solution {
    public void swap(int i,int j, int matrix[][]){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
        }
    public void reverse(int matrix[]){
        int i=0;
        int j=matrix.length-1;
        while(i<j){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                swap(i,j,matrix);
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
}