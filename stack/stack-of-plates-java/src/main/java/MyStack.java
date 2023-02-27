import java.util.Stack;

public class MyStack extends Stack<Integer> {
    private final int limit = 5;
    private int currentSize;

    @Override
    public Integer push(Integer item) {
        if (currentSize == limit) {
            return null;
        }

        currentSize += 1;
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        if (isEmpty()) {
            return null;
        }

        currentSize -= 1;
        return super.pop();
    }

    public boolean isFull() {
        return limit == currentSize;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }
}
