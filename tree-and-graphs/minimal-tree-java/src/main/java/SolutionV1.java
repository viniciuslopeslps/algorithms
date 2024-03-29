import java.util.ArrayList;

public class SolutionV1 {

    public Node minTree(Integer[] numbers) {
        int pivot = (numbers.length) / 2;

        var nodes = new ArrayList<Node>();
        Node root = new Node(numbers[pivot]);
        nodes.add(root);

        int smallIdx = pivot - 1;
        int bigIdx = pivot + 1;

        while (smallIdx >= 0) {
            Node first = nodes.get(0);

            first.left = new Node(numbers[smallIdx]);
            nodes.add(first.left);

            if (bigIdx < numbers.length) {
                first.right = new Node(numbers[bigIdx]);
                nodes.add(first.right);
            }

            smallIdx -= 1;
            bigIdx += 1;
            nodes.remove(0);
        }

        return root;
    }
}
