package Sort;

/*
* Insertion Sort
* Building the sorted array one element at a time by repeatedly picking the next element and inserting into the correct
* position
* Time Complexity = O(n^2)
* */

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {1, -2, 4,-10, 20, 90,3};
        System.out.println("UnSorted array: " + Arrays.toString(intArray));
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }

    public static void swap(int[] arr, int i, int j) {

        if (i == j)return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
