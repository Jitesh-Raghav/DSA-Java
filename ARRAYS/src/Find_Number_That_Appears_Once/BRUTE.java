//https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
//https://leetcode.com/problems/single-number/

//BRUTE FORCE SOLUTION:
// For every element present in the array, we will do a linear search
// and count the occurrence. If for any element, the occurrence is 1, we will return it.

package Find_Number_That_Appears_Once;

public class BRUTE {
    public static int getSingleElement(int[] arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i])
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}

//Time Complexity: O(N^2)
//Space Complexity: O(1) as we are not using any extra space