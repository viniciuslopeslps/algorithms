import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionV1Test {


    @Test
    public void sumListTest() {
        Node nodeSix = new Node(null, 2);
        Node nodeFive = new Node(nodeSix, 9);
        Node nodeFour = new Node(nodeFive, 5);

        Node nodeThree = new Node(null, 6);
        Node nodeTwo = new Node(nodeThree, 1);
        Node nodeOne = new Node(nodeTwo, 7);

        SolutionV1 solutionV1 = new SolutionV1();
        Node response = solutionV1.sumList(nodeOne, nodeFour);

        List<Integer> expected = new ArrayList<>();
        extracted(response, expected);
        Assert.assertEquals(expected, List.of(new Integer[]{9, 1, 2}));
    }

    private static void extracted(Node node, List<Integer> expected) {
        expected.add(node.data);

        if (node.next == null) {
            return;
        }
        extracted(node.next, expected);
    }
}
