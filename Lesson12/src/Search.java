import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class Search {
    private Search() {
        super();
    }

    /**
     * @param array A sorted array of ints to search through. This must be sorted.
     * @param searchTerm An int to search the array for
     * @return Whether the searchTerm exists in the array
     */
    public static boolean binarySearch(int[] array, int searchTerm) {
        /*
        TODO: Fill this in. Note that you can either make copies of the array
         as you search, or perform the search without ever copying the array.
         Start with the former, then try for the latter.
         */
        while(array.length != 0) {
            int middleIndex = (array.length / 2 );
            int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
            int[] rightArray = Arrays.copyOfRange(array, (middleIndex+1), (array.length-1));

            if(searchTerm == array[middleIndex]) {
                return true;
            } else if(array.length == 2){
                if(searchTerm == array[0]){
                    return true;
                } else if(searchTerm == array[1]){
                    return true;
                } else {
                    return false;
                }
            } else {
                if(searchTerm < middleIndex) {
                    binarySearch(leftArray, searchTerm);
                } else if(searchTerm > middleIndex) {
                    binarySearch(rightArray, searchTerm);
                }
            }
        }
        return false;
    }
}
