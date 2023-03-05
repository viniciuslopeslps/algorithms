import java.util.Stack;

public class SolutionV1 {
    private Stack<Integer> sortedStack = new Stack<>();

    public Stack<Integer> sort(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            Stack<Integer> biggers = new Stack<>();
            addMin(stack, biggers, null);
            stack = biggers;
        }

        return sortedStack;
    }

    private Integer addMin(Stack<Integer> stack, Stack<Integer> biggers, Integer min) {
        if (stack.empty()) {
            sortedStack.add(min);
            return min;
        }

        // first time
        if (min == null) {
            min = stack.pop();
            return addMin(stack, biggers, min);
        }

        var popped = stack.pop();
        if (min > popped) {
            biggers.add(min);
            min = popped;
        } else {
            biggers.add(popped);
        }

        return addMin(stack, biggers, min);
    }
}
