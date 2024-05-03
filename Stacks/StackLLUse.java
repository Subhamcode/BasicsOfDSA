package Stacks;

public class StackLLUse {

    public static void main(String[] args) {
        StackUsingLL<Integer>stack=new StackUsingLL<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.top());

        stack.push(12);
        stack.push(13);
        stack.push(14);

//        stack.pop();
//        stack.pop();
//        stack.pop();


        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
}
