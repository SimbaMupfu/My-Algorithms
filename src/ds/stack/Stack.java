package ds.stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char newItem){
        if(isFull()){
            System.out.println("The stack is full, you can't keep adding stuff");
        }else{
            top++;
            stackArray[top] = newItem;
        }
    }

    public char pop(){
        if (isEmpty()){
            System.out.println("The stack is empty, you can't retrieve anymore stuff");
            return '0';
        }else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize - 1 == top);
    }
}
