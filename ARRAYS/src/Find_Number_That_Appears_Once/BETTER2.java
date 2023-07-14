//Intuition: The intuition will be the same as the array hashing. The only difference here
// is we will use the map data structure for hashing instead of using another array for hashing.


//The steps are as follows:
// 1.First, we will declare a map.
// 2.Now, using a loop we will store the elements of the array along with their frequency in the map data structure.
// 3.Using another loop we will iterate over the map, and try to find the element for which the frequency is 1, and finally, we will return that particular element.

package Find_Number_That_Appears_Once;
import java.util.*;
public class BETTER2 {
        public static int getSingleElement(int []arr) {
                //size of the array:
                int n = arr.length;

                // Declare the hashmap.
                // And hash the given array:
                HashMap<Integer, Integer> mpp = new HashMap<>();
                for (int i = 0; i < n; i++) {
                        int value = mpp.getOrDefault(arr[i], 0);
                        mpp.put(arr[i], value + 1);
                }

                //Find the single element and return the answer:
                for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
                        if (it.getValue() == 1) {
                                return it.getKey();
                        }
                }

                //This line will never execute
                //if the array contains a single element.
                return -1;
        }
}

