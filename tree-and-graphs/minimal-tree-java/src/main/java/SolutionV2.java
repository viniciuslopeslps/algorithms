public class SolutionV2 {
    public Node minTree(Integer[] numbers) {
        return createMinimalBST(numbers, 0, numbers.length - 1);
    }

    public Node createMinimalBST(Integer[] numbers, int start, int end) {
        if (end < start) {
            return null;
        }

        int pivot = (start + end) / 2;
        Node node = new Node(numbers[pivot]);
        node.left = createMinimalBST(numbers, start, pivot - 1);
        node.right = createMinimalBST(numbers, pivot + 1, end);
        return node;
    }
}
