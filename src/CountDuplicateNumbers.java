public class CountDuplicateNumbers {

    public static void main(String[] args){
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 4, 3, 2, 1, 5, 3};

        countDuplicates(firstArray, secondArray);
    }

    private static void countDuplicates(int[] firstArray, int[] secondArray) {
        int count = 0;
        for(int i = 0; i < firstArray.length; i++){
            for(int j = 0; j < secondArray.length; j++){
                if(firstArray[i] == secondArray[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
