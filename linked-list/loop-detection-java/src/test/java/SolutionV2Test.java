import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV2Test {

    @Test
    public void loopDetectionTest() {
        SolutionV2 solutionV2 = new SolutionV2();

        var nodeE = new Node(null, 'e');
        var nodeD = new Node(nodeE, 'd');
        var nodeC = new Node(nodeD, 'c');
        var nodeB = new Node(nodeC, 'b');
        var nodeA = new Node(nodeB, 'a');

        nodeE.next = nodeC;


        Character character = solutionV2.loopDetectionV2(nodeA);
        Assertions.assertEquals(character.charValue(), 'c');
    }

    @Test
    public void loopDetectionTest_2() {
        SolutionV2 solutionV2 = new SolutionV2();

        var nodeC = new Node(null, 'c');
        var nodeB = new Node(nodeC, 'b');
        var nodeA = new Node(nodeB, 'a');

        nodeC.next = nodeB;


        Character character = solutionV2.loopDetectionV2(nodeA);
        Assertions.assertEquals(character.charValue(), 'b');
    }

    @Test
    public void loopDetectionTest_3() {
        SolutionV2 solutionV2 = new SolutionV2();

         var nodeB = new Node(null, 'b');
        var nodeA = new Node(nodeB, 'a');

        nodeB.next = nodeA;


        Character character = solutionV2.loopDetectionV2(nodeA);
        Assertions.assertEquals(character.charValue(), 'b');
    }


    @Test
    public void loopDetectionTest_whenIsNotALoop() {
        SolutionV2 solutionV2 = new SolutionV2();

        var nodeE = new Node(null, 'e');
        var nodeD = new Node(nodeE, 'd');
        var nodeC = new Node(nodeD, 'c');
        var nodeB = new Node(nodeC, 'b');
        var nodeA = new Node(nodeB, 'a');


        Character character = solutionV2.loopDetectionV2(nodeA);
        Assertions.assertNull(character);
    }
}

