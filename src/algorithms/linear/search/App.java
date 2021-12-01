package algorithms.linear.search;

public class App {
    public static void main(String[] args){
        int[] myArray = {1, 2, 4, 8, 5, 9};
        System.out.println(linearSearch(myArray, 8));
    }

    public static int linearSearch(int[] arrayToSearchIn, int itemToSearch){
        int answer = -1;
        for(int i = 0; i < arrayToSearchIn.length; i++){
            if(arrayToSearchIn[i] == itemToSearch){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
