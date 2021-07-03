package learnings.arrays;

import java.util.HashMap;

/**
 * Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * arr[] = {1, 5, 3, 2}
 * Output: 2
 * Explanation: There are 2 triplets:
 * 1 + 2 = 3 and 3 +2 = 5
 */
public class CountTheTriplets {
    static int countTriplet(int arr[], int n)
    {
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        int count = 0;
        for(int ele: arr){
            map.put(ele, true);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(map.get(arr[i] + arr[j])  != null && map.get(arr[i] + arr[j]) == true)
                    count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4};
        System.out.println(countTriplet(arr, 4));
    }
}
