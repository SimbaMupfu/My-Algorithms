package ds.queue;

public class App {
    public static void main(String[] args){
        Queue queue = new Queue(5);
        queue.insert(234);
        queue.insert(549);
        queue.insert(983);
        queue.insert(167);
        queue.insert(431);
        queue.insert(421);

        queue.viewItems();
    }
}
