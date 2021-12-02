package algorithms.recursion;

public class App {
    public static void main(String[] args){
        reduceByOne(25);
    }

    public static void reduceByOne(int limit){
        if(limit >= 0){
            reduceByOne(limit - 1);
        }
        System.out.println("Currently on: " + limit); //back tracing
    }
}
