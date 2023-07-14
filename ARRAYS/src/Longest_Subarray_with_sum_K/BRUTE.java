//https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/


//Here, in this approach, we are going to generate all possible subarrays to solve this problem.

package Longest_Subarray_with_sum_K;

public class BRUTE {
    public static int getLongestSubarray(int []a, long k) {

            int n = a.length; // size of the array.

            int len = 0;
            for (int i = 0; i < n; i++) { // starting index
                for (int j = i; j < n; j++) { // ending index
                    // add all the elements of
                    // subarray = a[i...j]:
                    long s = 0;
                    for (int K = i; K <= j; K++) {
                        s += a[K];
                    }

                    if (s == k)
                        len = Math.max(len, j - i + 1);
                }
            }
            return len;
        }



        //A BIT OPTIMISED AS THIS HAS 0(N^2) TC NOT N^3
//        int n = a.length; // size of the array.
//        int len = 0;
//        for (int i = 0; i < n; i++) { // starting index
//            long s = 0; // Sum variable
//            for (int j = i; j < n; j++) { // ending index
//                // add the current element to
//                // the subarray a[i...j-1]:
//                s += a[j];
//
//                if (s == k)
//                    len = Math.max(len, j - i + 1);
//            }
//        }
//        return len;
  //}

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
