package algorithms.sorting.insertionsort;

public class InsertionSort {
    public static void main(String[] args){
        int[] myArray = {25, 3, 19, 8, 18};
        for(int i = 0; i < performInsertionSort(myArray).length; i++){
            System.out.println(performInsertionSort(myArray)[i]);
        }
    }

    private static int[] performInsertionSort(int[] arrayToSort) {
        for(int i = 1; i < arrayToSort.length; i++){
            int currentElement = arrayToSort[i];
            int j = i - 1;
            while(j >= 0 && arrayToSort[j] > currentElement){
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = currentElement;
        }
        return arrayToSort;
    }
}
