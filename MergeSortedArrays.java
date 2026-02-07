/*
 This program merges two sorted arrays into one sorted array.
 We compare numbers from both arrays one by one and put the smaller one into a new array.
*/
public class MergeSortedArrays {

    /*
     This method takes two sorted arrays and then it returns one merged sorted array.
     arr1 = first array
     arr2 = second array
     */
    public static int[] merge(int[] arr1, int[] arr2) {

        // Create a new array to store the final merged result
        int[] mergedArray = new int[arr1.length + arr2.length];

        // i is used to move through arr1
        // j is used to move through arr2
        // k is used to move through mergedArray
        int i = 0;
        int j = 0;
        int k = 0;

        // This loop runs while both arrays still have numbers left to compare
        while (i < arr1.length && j < arr2.length) {

            // Compare the current numbers from both of the arrays
            if (arr1[i] <= arr2[j]) {
                // Put the smaller number from arr1 into mergedArray
                mergedArray[k] = arr1[i];
                i++; // move to the next number in arr1
            } else {
                // Put the smaller number from arr2 into mergedArray
                mergedArray[k] = arr2[j];
                j++; // move to the next number in arr2
            }

            // Move to the next position in mergedArray
            k++;
        }

        // If arr1 still has leftover numbers, copy them into mergedArray
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // If arr2 still has leftover numbers, copy them into mergedArray
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        // Return the merged sorted array
        return mergedArray;
    }
}
