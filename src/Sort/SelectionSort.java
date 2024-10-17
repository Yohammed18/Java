package Sort;
/*
* Selection sort looks for the smallest element in the unsoirted portion of the list
* and places it at the begging (smallest to larget order)
* Time Complexity = O(n^2)
* */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {-12,3, 9, 0, 1, 0,-32};

        System.out.println("Selection Sort\n");
        System.out.println("Unsorted array: " + Arrays.toString(intArray));

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }


    public static void swap(int[] array, int i, int j){

        if (i == j ) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
