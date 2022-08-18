import java.util.Random;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1;  i <= 10; i++) {
            stack.push(new Random().nextInt(90));
        }
        System.out.println("Before Deleting Middle Element-----");
        System.out.println(stack);
        deleteMiddleEle(stack);
        System.out.println("After Deleting Middle Element-----");
        System.out.println(stack);
    }

    private static void deleteMiddleEle(Stack<Integer> stack) {
        if (stack.size() == 0) {
            System.out.println("There is no element to delete");
            return;
        }
        int mid = stack.size() / 2 + 1;
        deleteMiddle(stack, mid);
    }

    private static void deleteMiddle(Stack<Integer> stack, int mid) {
        if (mid == 1) {
            stack.pop();
            return;
        }
        int ele = stack.pop();
        deleteMiddle(stack, mid - 1);
        stack.push(ele);
    }
}
