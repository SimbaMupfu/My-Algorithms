package adt;

public class App {

    public static void main(String[] args){
        Counter counter = new Counter("The Counter");
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter);
    }
}
