import java.util.ArrayList;
import java.util.Arrays;

public class SolutionV1 {

    public Node minTree(Integer[] numbers) {
        int pivot = getPivot(numbers);
        Integer[] smallers = Arrays.copyOfRange(numbers, 0, pivot);
        Integer[] biggers = Arrays.copyOfRange(numbers, pivot, numbers.length);
        

        var nodes = new ArrayList<Node>();
        Node root = new Node(pivot);
        nodes.add(root);

        int smallIdx = smallers.length - 2;
        int bigIdx = 0;

        while (!nodes.isEmpty()) {
            if (smallIdx < 0) {
                return root;
            }

            Node first = nodes.get(0);

            var small = smallers[smallIdx];
            first.left = new Node(small);
            nodes.add(first.left);

            if (bigIdx < biggers.length) {
                var big = biggers[bigIdx];
                first.right = new Node(big);
                nodes.add(first.right);
            }

            smallIdx -= 1;
            bigIdx += 1;
            nodes.remove(0);
        }

        return root;
    }

    private static int getPivot(Integer[] numbers) {
        int middle = (numbers.length) / 2;
        return middle + 1;
    }
}
