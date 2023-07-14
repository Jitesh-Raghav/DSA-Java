
//https://www.youtube.com/watch?v=ZYpYur0znng&ab_channel=takeUforward
//https://leetcode.com/problems/search-a-2d-matrix/

package Search_In_Matrix;

public class Search_In_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;             //WHEN MATRIX IS STRICTLY INCREASING...
        int hi = (n * m) - 1;

        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }
}

//THIS IS THE OPTIMAL SOLUTION FOR Q74 LEETCODE, HERE BINARY SEARCH USE KIYA HAI