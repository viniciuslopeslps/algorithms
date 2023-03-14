import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SolutionV1Test {

    @Test
    public void minTreeTest() {
        SolutionV1 solutionV1 = new SolutionV1();
        var numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Node nodeResponse = solutionV1.minTree(numbers);
        var expected = new ArrayList<Integer>();
        helper(nodeResponse, expected);

        Assertions.assertArrayEquals(expected.stream().mapToInt(o -> o).toArray(), new int[]{5, 4, 6, 3, 7, 2, 8, 1});
    }

    public void helper(Node node, List<Integer> response) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            response.add(temp.value);

            /*add left child to the queue */
            if (temp.left != null) {
                queue.add(temp.left);
            }

            /*add right right child to the queue */
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }
}
