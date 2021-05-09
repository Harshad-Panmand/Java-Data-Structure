public class SelectionSort {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 7, 55, 1, -22};
        //int[] unsortedArray = {5, 4, 3, 2, 1};
        int[] sortedArray = selectionSort(unsortedArray);
        for (int index = 0; index < sortedArray.length; index++) {
            System.out.println(sortedArray[index]);
        }
    }


    public static int[] selectionSort(int[] intArray) {

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

        return intArray;
    }


    public static void swap(int[] intArray, int firstIndex, int lastIndex) {

        int temp = intArray[firstIndex];
        intArray[firstIndex] = intArray[lastIndex];
        intArray[lastIndex] = temp;
    }
}
