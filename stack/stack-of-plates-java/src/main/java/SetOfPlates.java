import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOfPlates {
    List<MyStack> stacks = new ArrayList<>();
    List<Integer> lastPushed = new ArrayList<>();

    public Integer push(Integer item) {
        if (stacks.isEmpty()) {
            return pushToNewStack(item, 0);
        }

        for (int i = 0; i < stacks.size(); i++) {
            var current = stacks.get(i);
            if (!current.isFull()) {
                this.lastPushed.add(i);
                return current.push(item);
            }
        }

        return pushToNewStack(item, stacks.size());
    }

    public Integer pop() {
        if (stacks.isEmpty() || this.lastPushed.isEmpty()) {
            return null;
        }

        Integer lastPushedIndex = this.lastPushed.get(this.lastPushed.size() - 1);

        MyStack lastPushed = stacks.get(lastPushedIndex);
        Integer popped = lastPushed.pop();
        this.lastPushed.remove(lastPushedIndex);

        if (lastPushed.isEmpty()) {
            stacks.remove(lastPushed);
        }

        return popped;
    }


    private Integer pushToNewStack(Integer item, int index) {
        var newStack = new MyStack();
        stacks.add(newStack);
        this.lastPushed.add(index);
        return newStack.push(item);
    }

}

