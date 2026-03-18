class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean fri = false;
        boolean fci = false;

        for(int c = 0; c< n;c++){
            if(matrix[0][c] == 0){
                fri = true;
                break;
            }
        }
        for(int r = 0; r< m; r++){
            if(matrix[r][0] == 0){
                fci = true;
                break;
            }
        }
        for(int i = 1; i< m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fri){
            for(int j =0;j<n;j++){
                matrix[0][j] = 0;
            }
        }
        if(fci){
            for(int i =0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}

































// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
 
//         boolean fri = false;
//         boolean fci = false;

//         for(int c =0;c<n;c++){
//             if(matrix[0][c] == 0){
//                 fri = true;
//                 break;
//             }
//         }
//         for(int r =0;r<m;r++){
//             if(matrix[r][0] == 0){
//                 fci = true;
//                 break;
//             }
//         }
//         for(int i =1;i<m;i++){
//             for(int j =1;j<n;j++){
//                 if(matrix[i][j] == 0){
//                     matrix[i][0] = 0;
//                     matrix[0][j] = 0; 
//                 }
//             }
//         }
//         for(int i =1;i<m;i++){
//             for(int j =1;j<n;j++){
//                 if(matrix[i][0] == 0 || matrix[0][j] == 0){
//                     matrix[i][j] =0;
//                 }
//             }
//         }
//         if(fri){
//             for(int j =0;j<n;j++){
//                 matrix[0][j] = 0;
//             }
//         }
//         if(fci){
//             for(int i =0;i<m;i++){
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }
// int temp[][] = new int[m][n];

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 temp[i][j] = matrix[i][j];
//             }
//         }

//         for(int i = 0; i <m; i++){
//             for(int j = 0; j < n; j++){
//                 if(matrix[i][j] == 0){
//                     for(int k = 0; k < n; k++){
//                         temp[i][k] = 0;
//                     }
//                     for(int k = 0; k < m; k++){
//                         temp[k][j] = 0;
//                     }
//                 }
//             }
//         } 
        
//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 matrix[i][j] = temp[i][j];
//             }
//         }  
