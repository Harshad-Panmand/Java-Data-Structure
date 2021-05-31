/**
 * Worst Case Time Complexity [ Big-O ]: O(n2)
 * Best Case Time Complexity [Big-omega]: O(n2)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(1)
 * <p>
 * The space complexity for Bubble Sort is O(1),
 * because only a single additional memory space is required
 * i.e. for temp variable.
 * <p>
 * Unstable Sort
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //int[] intArray = {5, 4, 3, 2, 1};
        selectionSort(intArray);
        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
    }


    public static void selectionSort(int[] intArray) {

        // If array is already sorted then no need to iterate next time
        boolean alreadySorted = true;

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestValueIndex = 0;

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[largestValueIndex] < intArray[i + 1]) {
                    largestValueIndex = i + 1;
                    alreadySorted = false;
                }
            }

            if (alreadySorted == true) {
                break;
            }

            swap(intArray, largestValueIndex, lastUnsortedIndex);
        }
    }


    public static void swap(int[] intArray, int firstIndex, int lastIndex) {

        int temp = intArray[firstIndex];
        intArray[firstIndex] = intArray[lastIndex];
        intArray[lastIndex] = temp;
    }
}
