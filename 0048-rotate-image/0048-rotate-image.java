class Solution {
    public void rotate(int[][] arr) {
        int rows = arr.length;

        for(int i = 0 ;i < rows; i++){
            for(int j = 0 ; j < i ; j++){
                // swap 
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;

            }
        }

       
        for(int i = 0 ; i < rows ; i++){
             int a = 0 ;
             int b = rows - 1;
        while(a<b){
            // swap 
            int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] =temp;
                a++;
                b--;
        }

        }

    }
}