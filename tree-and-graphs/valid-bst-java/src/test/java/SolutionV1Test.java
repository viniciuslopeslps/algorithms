import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    @Test
    public void checkBalancedTest_whenBst() {
        Node node8 = new Node(8);
        Node node4 = new Node(4);
        Node node10 = new Node(10);
        Node node2 = new Node(2);
        Node node6 = new Node(6);
        Node node20 = new Node(20);


        node8.left = node4;
        node8.right = node10;

        node4.left = node2;
        node4.right = node6;

        node10.left = null;
        node10.right = node20;


        SolutionV1 solutionV1 = new SolutionV1();
        boolean res = solutionV1.validBst(node8);
        Assertions.assertTrue(res);
    }

    @Test
    public void checkBalancedTest_whenNotBst() {
        Node node8 = new Node(8);
        Node node4 = new Node(4);
        Node node10 = new Node(10);
        Node node2 = new Node(2);
        Node node12 = new Node(12);
        Node node20 = new Node(20);


        node8.left = node4;
        node8.right = node10;

        node4.left = node2;
        node4.right = node12;


        node10.left = null;
        node10.right = node20;

        SolutionV1 solutionV1 = new SolutionV1();
        boolean res = solutionV1.validBst(node8);
        Assertions.assertFalse(res);
    }
}

