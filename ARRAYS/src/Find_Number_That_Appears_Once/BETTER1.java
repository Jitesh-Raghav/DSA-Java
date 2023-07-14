
//BETTER SOLUTION: USING HASHING. In order to hash using an array, we need to first
// find the maximum element(say maxElement) to get the range of the hash array.

package Find_Number_That_Appears_Once;

public class BETTER1 {
    public static int getSingleElement(int[] arr) {
        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}

//Time Complexity: O(N)+O(N)+O(N), where N = size of the array
//Reason: One O(N) is for finding the maximum, the second one is to hash the
// elements and the third one is to search the single element in the array.

//Space Complexity: O(maxElement+1)