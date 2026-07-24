class Solution {
    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        int num = 1 ;

        while(minRow <= maxRow && minCol <= maxCol){
            
            // Left to Right
            for (int j = minCol; j <= maxCol; j++) {
                arr[minRow][j] = num++ ;
            }
            minRow++;

            // Top to Bottom
            for (int i = minRow; i <= maxRow; i++) {
               arr[i][maxCol] = num++;
            }
            maxCol--;

            if (minRow > maxRow) break;

            // Right to Left
            for (int j = maxCol; j >= minCol; j--) {
               arr[maxRow][j]=num++;
            }
            maxRow--;

            if (minCol > maxCol) break;

            // Bottom to Top
            for (int i = maxRow; i >= minRow; i--) {
              arr[i][minCol] = num++;
            }
            minCol++;
        
        }
        return arr;
        
    }
}