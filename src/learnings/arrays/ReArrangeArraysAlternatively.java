package learnings.arrays;

import learnings.utils.HelperMethods;

/**
 * https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
 */
public class ReArrangeArraysAlternatively {
    public static void rearrange(int arr[], int n){
        int minIndex = 0;
        int maxIndex = n-1;
        int maxElement= arr[maxIndex] + 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex --;
            }
            else{
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex ++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = arr[i]/maxElement;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rearrange(arr, arr.length);
        HelperMethods.displayElementsFromArrayInt(arr, arr.length);
    }
}
