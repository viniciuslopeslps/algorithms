import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionV1Test {

    @Test
    public void removeDupsTest() {
        SolutionV1 solutionV1 = new SolutionV1();

        Node node4 = new Node(null, 1);
        Node node3 = new Node(node4, 3);
        Node node2 = new Node(node3, 2);
        Node node1 = new Node(node2, 1);

        solutionV1.removeDups(node1);
        List<Integer> expected = new ArrayList<>();
        extracted(node1, expected);
        Assertions.assertEquals(expected, List.of(new Integer[]{1, 2, 3}));
    }

    private static void extracted(Node node, List<Integer> expected) {
        expected.add(node.getData());

        if (node.getNext() == null) {
            return;
        }
        extracted(node.getNext(), expected);
    }
}
