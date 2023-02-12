public class SolutionV1 {

    Node sumList(Node nodeOne, Node nodeTwo) {
        StringBuilder sbOne = new StringBuilder();
        helper(nodeOne, sbOne);

        StringBuilder sbTwo = new StringBuilder();
        helper(nodeTwo, sbTwo);
        String result = String.valueOf(Integer.parseInt(sbOne.toString()) + Integer.parseInt(sbTwo.toString()));

        Node previous = null;

        for (int i = result.length() - 1; i >= 0; i--) {
            Node current = new Node(previous, Character.getNumericValue(result.charAt(i)));
            previous = current;
        }
        return previous;
    }

    void helper(Node node, StringBuilder sb) {
        if (node.next == null) {
            sb.append(node.data);
            return;
        }

        helper(node.next, sb);
        sb.append(node.data);
    }
}
