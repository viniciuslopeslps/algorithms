import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class SolutionV1Test {

    @Test
    public void sortTest() {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(1);
        stack.add(5);
        stack.add(4);
        stack.add(3);

        SolutionV1 solutionV1 = new SolutionV1();
        Stack<Integer> sort = solutionV1.sort(stack);
        var expected = new int[]{1, 2, 3, 4, 5};
        int[] response = sort.stream().mapToInt(o -> o).toArray();
        Assertions.assertArrayEquals(expected, response);
    }
}
