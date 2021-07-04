package learnings.arrays;

/**
 * https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#
 */
public class MissingNumber {
    static int missingNumber(int array[], int n) {
        int totalSum = (n* (n+1))/2;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += array[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,5};
        System.out.println(missingNumber(array, 5));
    }
}
