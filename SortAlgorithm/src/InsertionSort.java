/**
 * Worst Case Time Complexity [ Big-O ]: О(n2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(n)
 * <p>
 * Stable Sort
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //int[] unsortedArray = {5, 4, 3, 2, 1};
        InsertionSort(intArray);
        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
    }

    public static void InsertionSort(int[] intArray) {

        final int arrayLength = intArray.length;

        for (int unsortedArrayIndex = 1; unsortedArrayIndex < arrayLength; unsortedArrayIndex++) {

            int newElement = intArray[unsortedArrayIndex];

            int sortedArrayIndex;
            for (sortedArrayIndex = unsortedArrayIndex; sortedArrayIndex > 0
                    && intArray[sortedArrayIndex - 1] > newElement; sortedArrayIndex--) {

                intArray[sortedArrayIndex] = intArray[sortedArrayIndex - 1];

            }
            intArray[sortedArrayIndex] = newElement;
        }
    }
}
