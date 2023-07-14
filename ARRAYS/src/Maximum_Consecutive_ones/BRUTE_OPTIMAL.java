//https://leetcode.com/problems/max-consecutive-ones/

package Maximum_Consecutive_ones;
import java.util.Scanner;

public class BRUTE_OPTIMAL {
    public static int findMaxConsecutiveOnes(int[] nums){
        int maxi= 0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
                maxi= Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxConsecutiveOnes(arr));
    }
}

//THIS IS THE OPTIMAL APPROACH WITH TC-O(N) AND SC-O(1)..