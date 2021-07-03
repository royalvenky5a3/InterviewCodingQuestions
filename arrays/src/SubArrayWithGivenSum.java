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
        int currSum = arr[0];
        int start = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
        if(n == 1 && currSum == s){
            output.add(currSum);
            output.add(currSum);
            return output;
        }
        for(int i=1;i<n;i++){

            if(currSum > s && start <= i){
                currSum -= arr[start];
                start ++;
            }
            if(currSum == s){
                output.add(start+1);
                output.add(i);
                return output;
            }
            currSum += arr[i];
        }
        if(currSum == s){
            output.add(start+1);
            output.add(n);
            return output;
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(getContinousSubArray(arr, arr.length, 5));
    }
}
