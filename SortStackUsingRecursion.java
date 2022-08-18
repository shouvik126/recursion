import java.util.Random;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1;  i <= 10; i++) {
            stack.push(new Random().nextInt(90));
        }
        System.out.println("Before Sort-----");
        System.out.println(stack);
        listSort(stack);
        System.out.println("After Sort-----");
        System.out.println(stack);
    }

    private static void listSort(Stack<Integer> stack) {
        if (stack.size() == 1)
            return;

        int lastValue = stack.pop();
        listSort(stack);
        insertAtList(stack, lastValue);
    }

    private static void insertAtList(Stack<Integer> stack, Integer no) {
        if (stack.size() == 0 || stack.peek() <= no) {
            stack.push(no);
            return;
        }
        int lastEle = stack.pop();
        insertAtList(stack, no);
        stack.push(lastEle);
    }
}
