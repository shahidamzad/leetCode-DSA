class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n  = arr[0].length;

        List<Integer> ans = new ArrayList<>();

        int minRow =0 ;
        int maxRow = m-1 ;
        int minCol = 0 ;
        int maxCol = n-1 ;


         while (minRow <= maxRow && minCol <= maxCol) {

            // Left to Right
            for (int j = minCol; j <= maxCol; j++) {
                ans.add(arr[minRow][j]);
            }
            minRow++;

            if (minRow > maxRow || minCol > maxCol) break;

            // Top to Bottom
            for (int i = minRow; i <= maxRow; i++) {
                ans.add(arr[i][maxCol]);
            }
            maxCol--;

            if (minRow > maxRow || minCol > maxCol) break;

            // Right to Left
            for (int j = maxCol; j >= minCol; j--) {
                ans.add(arr[maxRow][j]);
            }
            maxRow--;

            if (minRow > maxRow || minCol > maxCol) break;

            // Bottom to Top
            for (int i = maxRow; i >= minRow; i--) {
                ans.add(arr[i][minCol]);
            }
            minCol++;
            }
       return ans;
        
    }
    
}
