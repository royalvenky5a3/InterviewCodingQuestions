package learnings.arrays;

import learnings.utils.HelperMethods;

public class InversionOfArray {
    public static void merge(int[] arr, int l, int mid,int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        for(int i=0;i<n1;i++){
            left[i] = arr[l + i];
        }
        int[] right = new int[n2];
        for(int j=0;j<n2;j++){
            right[j] = arr[mid + j + 1];
        }

        int i=0,j=0,k=l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                System.out.println("hai");
                arr[k++] = left[i++];
            }
            else{
                System.out.println("helo");
                arr[k++] = right[j++];
            }
        }
        while(i < n1){
            arr[k++] = left[i++];
        }
        while(j < n2){
            arr[k++] = right[j++];
        }
    }
    public static int[] mergeSort(int[] arr, int l, int r){
        if(l < r){
            int mid = l+(r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        arr = mergeSort(arr, 0, 4);
        HelperMethods.displayElementsFromArrayInt(arr, 5);
    }
}
