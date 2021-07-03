package learnings.arrays;

import java.util.ArrayList;

/**
 * Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.
 */
public class SubArrayWithGivenSum {
    public static ArrayList<Integer> getContinousSubArray(int[] arr, int n, int s){
        int currSum = 0;
        int start = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
        if(n == 1 && currSum == s){
            output.add(currSum);
            output.add(currSum);
            return output;
        }
        for(int i=0;i<n;i++){
            currSum += arr[i];
            while(currSum > s && start <= i){
                currSum -= arr[start];
                start ++;
            }
            if(currSum == s){
                output.add(start+1);
                output.add(i+1);
                return output;
            }

        }
        if(currSum == s){
            output.add(start+1);
            output.add(n);
            return output;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        System.out.println(getContinousSubArray(arr, arr.length, 468));
    }
}
