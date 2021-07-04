package learnings.utils;

import java.lang.reflect.Array;

public class HelperMethods {
    public static <T> void displayElementsFromArray(long[] array, int length){
        for(long ele: array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void displayElementsFromArrayInt(int[] array, int length){
        for(int ele: array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
