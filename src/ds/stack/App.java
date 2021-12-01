package ds.stack;

public class App {
    public static void main(String[] args){
//        Stack stack = new Stack(10);
//        stack.push(12);
//        stack.push(28);
//        stack.push(45);
//        stack.push(1000);
//        stack.push(108);
//        stack.push(329);
//        stack.push(54);
//        stack.push(100);
//        stack.push(118);
//        stack.push(526);
//        stack.push(378);
//
//        while(!stack.isEmpty()){
//            long currentItem = stack.pop();
//            System.out.println(currentItem);
//        }
        System.out.println(reverseString("game"));
    }

    public static String reverseString(String str){
        int stackSize = str.length();
        Stack stack = new Stack(stackSize);
        for (int i = 0; i < stackSize; i++){
            stack.push(str.charAt(i));
        }

        String reversedString = "";
        while (!stack.isEmpty()){
            reversedString = reversedString + stack.pop();
        }
        return reversedString;
    }
}
