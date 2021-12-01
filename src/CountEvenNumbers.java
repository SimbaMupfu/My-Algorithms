public class CountEvenNumbers {

    public static void main(String[] args){
        int[] numbers = {2, 3, 4, 5, 7, 8, 9, 10, 10, 12};

        countEvens(numbers);
    }

    private static void countEvens(int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("There are " + count + " even numbers in this array.");
    }
}
