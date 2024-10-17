package Sort;

/*
* Shell Short - A generalization of insertion sort that allows exchanges of far-apart elements to improve performance.
* Time Complexity = O (n log^2 n)
* Worst case = O(n^2)
* Unstable algorithm
* In-place algorithm
* 
* */

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = {-12,3, 9, 0, 1, 0,-32};

        System.out.println("Shell Sort\n");
        System.out.println("Unsorted array: " + Arrays.toString(intArray));

        for (int gap = intArray.length /2; gap > 0 ; gap /= 2) {

            for(int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j-gap] > newElement) {
                    intArray[j] = intArray[j-gap ];
                    j-=gap;
                }

                intArray[j] = newElement;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}
