//FLOOR IS THE LARGEST NUMBER SMALLER THAN THE TARGET ELEMENT

package Find_Ceiling_Or_Floor_In_SortedArray;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index: greatest number <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }

}

//FOR TARGET=1 IT RETURNS -1 CUZ END BECOMES -1 THAT TIME...SO IT WORKS PERFECTLY
//DON'T NEED TO ADD ANOTHER CASE LIKE IF(TARGET<ARR[0])....I.E WHAT IF TARGET IS THE SMALLEST ELEMENT

//WE ADDED A CASE FOR IF TARGET IS > LARGEST NUMBER IN CEILING CASE TO RETURN -1