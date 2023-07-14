
//USING XOR OPERATION:

//Assume the given array is: [4,1,2,1,2]
//        XOR of all elements = 4^1^2^1^2
//        = 4 ^ (1^1) ^ (2^2)
//        = 4 ^ 0 ^ 0 = 4^0 = 4


package Find_Number_That_Appears_Once;

public class OPTIMAL {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}

//Time Complexity: O(N), where N = size of the array.
//Reason: We are iterating the array only once.

//Space Complexity: O(1) as we are not using any extra space