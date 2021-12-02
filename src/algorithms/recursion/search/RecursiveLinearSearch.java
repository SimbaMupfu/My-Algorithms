package algorithms.recursion.search;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] myArray = {4, 3, 2, 1, 6};
        System.out.println(recursiveLinearSearch(myArray, 0, 3));
    }

    public static int recursiveLinearSearch(int[] arrayToSearch, int i, int x) {
        int answer = -1;
        if (i > arrayToSearch.length - 1) {
            return answer;
        } else if (arrayToSearch[i] == x) {
            answer = i;
        } else {
            System.out.println("At index: " + i);
            answer = recursiveLinearSearch(arrayToSearch, i + 1, x);
        }

        return answer;
    }
}
