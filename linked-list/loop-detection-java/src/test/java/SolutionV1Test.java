import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    @Test
    public void loopDetectionTest() {
        SolutionV1 solutionV1 = new SolutionV1();

        var nodeE = new Node(null, 'e');
        var nodeD = new Node(nodeE, 'd');
        var nodeC = new Node(nodeD, 'c');
        var nodeB = new Node(nodeC, 'b');
        var nodeA = new Node(nodeB, 'a');

        nodeE.next = nodeC;


        Character character = solutionV1.loopDetection(nodeA);
        Assertions.assertEquals(character.charValue(), 'c');
    }

    @Test
    public void loopDetectionTest_whenIsNotALoop() {
        SolutionV1 solutionV1 = new SolutionV1();

        var nodeE = new Node(null, 'e');
        var nodeD = new Node(nodeE, 'd');
        var nodeC = new Node(nodeD, 'c');
        var nodeB = new Node(nodeC, 'b');
        var nodeA = new Node(nodeB, 'a');


        Character character = solutionV1.loopDetection(nodeA);
        Assertions.assertNull(character);
    }
}
