/**
 * Worst Case Time Complexity [ Big-O ]: O(n2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(1)
 * <p>
 * The space complexity for Bubble Sort is O(1),
 * because only a single additional memory space is required
 * i.e. for temp variable.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 7, 55, 1, -22};
        int[] sortedArray = bubbleSort(unsortedArray);
        for (int index = 0; index < sortedArray.length; index++) {
            System.out.println(sortedArray[index]);
        }

    }

    public static int[] bubbleSort(int[] intArray) {

        boolean alreadySorted = true;
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int index = 0; index < lastUnsortedIndex; index++) {

                // If intArray[index] > intArray[index + 1]
                // Do swap the values of index
                // This way array will be sorted in ascending order i.e. lower to upper value
                // intArray[index] < intArray[index + 1] will sort array in descending order
                if (intArray[index] > intArray[index + 1]) {
                    alreadySorted = false;
                    swap(intArray, index, index + 1);
                }
            }

            if (alreadySorted == true) {
                break;
            }
        }
        return intArray;
    }

    public static void swap(int[] intArray, int firstIndex, int lastIndex) {

        int temp = intArray[firstIndex];
        intArray[firstIndex] = intArray[lastIndex];
        intArray[lastIndex] = temp;
    }
}
