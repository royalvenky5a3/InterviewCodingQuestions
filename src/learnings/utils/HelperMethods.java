package learnings.utils;

import java.lang.reflect.Array;

public class HelperMethods {
    public static <T> void displayElementsFromArray(long[] array, int length){
        for(long ele: array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
