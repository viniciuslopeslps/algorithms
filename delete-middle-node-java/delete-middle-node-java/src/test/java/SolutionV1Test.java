import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    @Test
    void deleteMiddleTest() {
        Node nodeSix = new Node(null, "f");
        Node nodeFive = new Node(nodeSix, "e");
        Node nodeFour = new Node(nodeFive, "d");
        Node nodeThree = new Node(nodeFour, "c");
        Node nodeTwo = new Node(nodeThree, "b");
        Node nodeOne = new Node(nodeTwo, "a");

        SolutionV1 solutionV1 = new SolutionV1();
        solutionV1.deleteMiddle(nodeOne, "c");
        List<String> expected = new ArrayList<>();
        extracted(nodeOne, expected);
        Assertions.assertEquals(expected, List.of(new String[]{"a", "b", "d", "e", "f"}));
    }

    private static void extracted(Node node, List<String> expected) {
        expected.add(node.getData());

        if (node.getNext() == null) {
            return;
        }
        extracted(node.getNext(), expected);
    }
}
