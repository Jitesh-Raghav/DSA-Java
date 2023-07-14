//THIS IS LEETCODE Q240
//https://leetcode.com/problems/search-a-2d-matrix-ii/
//https://www.youtube.com/watch?v=ZYpYur0znng&ab_channel=takeUforward

package Search_In_Matrix;

import java.util.Arrays;

public class Search_In_2D_Matrix2 {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},       //MATRIX IS SORTED IN ROW AND COL WISE MANNER...
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;    //HERE THIS MATRIX LENGTH MAI [0] IS IMPORTANT CUZ WHEN LENGTH OF MATRIX IS 1 THEN IT FAILS..

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
