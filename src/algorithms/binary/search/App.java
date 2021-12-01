package algorithms.binary.search;

public class App {
    public static void main(String[] args){
        int[] myArray = {3, 11, 29, 41, 54, 61, 78, 110, 127};
        System.out.println(binarySearch(myArray, 41));
    }

    public static int binarySearch(int[] arrayToSearchIn, int itemToSearch){
        int answer = -1;
        int startingIndex = 0;
        int lastIndex = arrayToSearchIn.length - 1;

        while(startingIndex <= lastIndex){
            int midIndex = (startingIndex + lastIndex) / 2;
            if(arrayToSearchIn[midIndex] == itemToSearch){
                answer = midIndex;
                break;
            }else if(arrayToSearchIn[midIndex] > itemToSearch){
                lastIndex = midIndex - 1;
            }else{
                startingIndex = midIndex + 1;
            }
        }
        return answer;
    }
}
