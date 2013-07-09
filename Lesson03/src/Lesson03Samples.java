import java.util.Arrays;

public class Lesson03Samples {
 
    public static void main(String args[]) {
        int[] array1 = {1, 3, 5, 11};
        int[] array2 = {2, 4, 6, 12, 40};
        int[] arrayToMergeInPlace = {1, 3, 5, 6, 9, 2, 4, 7, 8, 11};
        int[] arrayToSort = {10, 400, 12, 57, 2, 5, 8, -10, 58, 3};
        merge(array1, array2);
        //mergeInPlace(arrayToMergeInPlace, 0, 5, 10);
        //mergeSort(arrayToSort);
    }

    public static int[] merge(int[] array1, int[] array2) {
        // Given two sorted arrays, combine them into a merged array which has all the elements of both in sorted order.
        int mergedArrayLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedArrayLength];
        int i1 = 0;
        int i2 = 0;
        for(int j = 0; j < mergedArrayLength; j++) {
            if(array1[i1] < array2[i2]) {
                if (i1 <= array1.length -1){
                    mergedArray[j] = array1[i1];
                    i1++;
                }
            } else if(array2[i2] < array1[i1]) {
                if (i2 <= array2.length -1){
                    mergedArray[j] = array2[i2];
                    i2++;
                }
            }
        }
        System.out.print(Arrays.toString(mergedArray));
        return mergedArray;
    }
 
    public static void mergeInPlace(int[] array, int i, int j, int k) {
        // Assuming that the elements of array are in sorted order between array[i] and array[j-1],
        // and between array[j] and array[k-1], rearrange the array to put the elements between array[i] and
        // array[k-1] in sorted order.
        //return;
    }
 
    public static void mergeSort(int[] arrayToSort) {
        // Using the mergeInPlace method you just wrote, write a function to sort a given array. Remember to make a
        // copy of the original array first to avoid overwriting the original. Hint: start by sorting the smallest
        // possible subsections of the array, and combine them with mergeInPlace until the whole array is sorted.
        //return sortedArray;
    }
 
    public static void bubbleSortWithComparisonCounter(int[] arrayToSort) {
        // Write an implementation of the bubble sort algorithm that keeps a count of how many times you compare
        // elements of the array (eg. array[i]<array[j]). Before returning the sorted array print the numbers of
        // comparisons used to the console.
        //return sortedArray;
    }
 
    public static void mergeSortWithComparisonCounter(int[] arrayToSort) {
        // Update your implementation of merge sort above to keep a count of comparisons. Try merge sort and bubble
        // sort with different arrays and look at the number of comparisons used. Why is merge sort more efficient?
        //return sortedArray;
    }
}
