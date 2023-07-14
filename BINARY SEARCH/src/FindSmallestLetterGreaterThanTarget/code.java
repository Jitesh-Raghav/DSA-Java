
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package FindSmallestLetterGreaterThanTarget;
import java.util.HashMap;

//public class code {
//    public static void main(String[] args) {
//
//    }

//    public char nextGreatestLetter(char[] letters, char target) {
//
//        int start = 0;
//        int end = letters.length - 1;
//
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return letters[start % letters.length];
//        //THIS CONDITON IS WRITTEN CUZ OF THE WRAP AROUND LETTERS....WHEN CHAR NAHI MILEGA THEN
//        //START WILL BE END+1, SO USKA MODULO LE LENGE THEN IT WILL RETURN TO THE FIRST ELEMENT OF ARRAY.
//
//    }
//
//    //a,b,d,e,g,h,q    target=i
//
//}



public class code {
    public char nextGreatestLetter(char[] arr, char t) {
        if(t=='z')return arr[0];
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr) map.put(c, 1);
        for(char i=t; i<='z'; i++){
            if(map.containsKey(i) && i!=t)return i;
            if(i=='z')i='a';
        }
        return arr[0];
    }
}


//THIS IS A BETTER SOLUTION DO IT WHEN U DO MAPS IN JAVA..