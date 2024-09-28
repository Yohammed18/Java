package Sort;

import java.util.Arrays;

/*
* Bubble Sort - algorithm performance degrades quickly as the number of
* input increase
* Time Complexity = O(n^2) - quadratic
* Space Complexity =
*
* Consider as an In-place algorithm
* */
public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, -22};
        System.out.println("Bubble Sort\n");
        System.out.println("Unsorted array: " + Arrays.toString(intArray));

        for (int lastUnsortedIndex = intArray.length -1;
             lastUnsortedIndex  > 0;
             lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if( intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        System.out.println("\nSorted Array: "+ Arrays.toString(intArray));
    }
    
    // create a swap method as a helper to swap 
    public static void swap(int[] array, int i, int j){
        if (i == j) return;
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 }
