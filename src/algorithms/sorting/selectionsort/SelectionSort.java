package algorithms.sorting.selectionsort;

public class SelectionSort {
    public static void main(String[] args){
        int[] myArray = {4, 6, 2, 7, 3, 8};
        for (int i = 0; i < myArray.length; i++){
            System.out.println(performSelectionSort(myArray)[i]);
        }
    }

    public static int[] performSelectionSort(int[] arrayToSort){
        for(int i = 0; i < arrayToSort.length; i++){
            int minimum = i;
            for(int j = i + 1; j < arrayToSort.length; j++){
                if(arrayToSort[j] < arrayToSort[minimum]){
                    minimum = j;
                }
            }
            int temp = arrayToSort[minimum];
            arrayToSort[minimum] = arrayToSort[i];
            arrayToSort[i] = temp;
        }
        return arrayToSort;
    }
}
