package learnings.arrays;

import learnings.utils.HelperMethods;

import java.util.Arrays;
import java.util.Collections;

public class MergeTwoSortedArrays {
    //Function to merge the arrays.
    static void customSort(long[] arr, int n){
        long min = arr[0];
        int minIndex = 0;
        for(int i=1;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        long temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
    }
    public static void merge(long arr1[], long arr2[], int n1, int n2)
    {
        int i = 0;
        int j = 0;
        while(i < n1){
            if(arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                customSort(arr2, n2);
            }
            i++;
        }
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0,2,4,6,8};
        merge(arr1, arr2, arr1.length, arr2.length);
        HelperMethods.displayElementsFromArray(arr1, arr1.length);
        HelperMethods.displayElementsFromArray(arr2, arr2.length);
    }
}
