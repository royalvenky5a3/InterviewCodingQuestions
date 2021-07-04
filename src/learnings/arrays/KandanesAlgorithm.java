package learnings.arrays;

public class KandanesAlgorithm {

        // arr: input array
        // n: size of array
        //Function to find the sum of contiguous subarray with maximum sum.
        static int maxSubarraySum(int arr[], int n){
            int maxSoFar = -Integer.MAX_VALUE;
            int tempMax = 0;
            for(int i=0;i<n;i++){
                tempMax = tempMax + arr[i];
                if(maxSoFar < tempMax)
                    maxSoFar =tempMax;
                if(tempMax < 0)
                    tempMax = 0;
            }

            return maxSoFar;

        }

        public static void main(String[] args) {
            int arr[] = {1,2,3,-2,5};
            int n = 5;
            System.out.println(maxSubarraySum(arr, n));
        }
}
