import java.util.Random;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1;  i <= 10; i++) {
            stack.push(new Random().nextInt(90));
        }
        System.out.println("Before Reversing Stack-----");
        System.out.println(stack);
        reverseStack(stack);
        System.out.println("After Reversing Stack-----");
        System.out.println(stack);
    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.size() == 1)
            return;

        int ele = stack.pop();
        reverseStack(stack);
        insert(stack, ele);
    }

    private static void insert(Stack<Integer> stack, int ele) {
        if (stack.size() == 0) {
            stack.push(ele);
            return;
        }

        int val = stack.pop();
        insert(stack, ele);
        stack.push(val);
    }
}