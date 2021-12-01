package ds.queue;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int numberOfItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        numberOfItems = 0;
    }

    public void insert(long newItem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = newItem;

    }

    public long remove() {
        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        numberOfItems--;
        return temp;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (numberOfItems == 0);
    }

    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    public void viewItems() {
        System.out.print("[");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }
}
