class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int rowarr[]=new int[rows];
        int colarr[]=new int[col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rowarr[i]=1;
                    colarr[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(rowarr[i]==1||colarr[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}