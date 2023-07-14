
//LEETCODE Q 1299
//Iska optimal solution ka intuition and algo is similar to leaders in an array problem

package Replace_Elements_with_Greatest_Element_on_Right_Side;

public class brute {
     class Solution {
     public int[] replaceElements(int[] arr) {
        int i;
         for( i=0; i<arr.length-1; i++)
         {
             int max= arr[i+1];
             for(int j=i+1; j<arr.length; j++)
             {
                 if(arr[j]> max)
                     max= arr[j];
             }
             arr[i]= max;
         }
         if(i == arr.length-1)
             arr[i]= -1;

         return arr;
     }
 }

}
