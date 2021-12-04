package algorithms.recursion.binary.search;

public class RecursiveBinarySearch {
    public static void main(String[] args){
        int[] myArray = {1, 3, 5, 7, 8, 9, 11, 12, 14, 15, 17, 19, 20};
        System.out.println(recursiveBinarySearch(myArray, 0, 12, 15));
    }

    private static int recursiveBinarySearch(int[] arrayToSearch, int startingPoint, int endingPoint, int x){
        int answer = -1;
        System.out.println("[" + startingPoint + "..." + endingPoint + "]");
        if(startingPoint > endingPoint){
            return answer;
        }else{
            int midPoint = (startingPoint + endingPoint)/2;
            if(arrayToSearch[midPoint] == x){
                answer = midPoint;
                System.out.println("At index: "  + answer);
                return answer;
            }else if(arrayToSearch[midPoint] > x){
                answer = recursiveBinarySearch(arrayToSearch, startingPoint, midPoint - 1, x);
                System.out.println("At index: "  + answer);
                return answer;
            }else{
                answer = recursiveBinarySearch(arrayToSearch, midPoint + 1, endingPoint, x);
                return answer;
            }
        }
    }
}
