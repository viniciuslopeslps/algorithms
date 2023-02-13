public class SolutionV1 {

    Node sumList(Node nodeOne, Node nodeTwo) {
        StringBuilder sbOne = new StringBuilder();
        helper(nodeOne, sbOne);

        StringBuilder sbTwo = new StringBuilder();
        helper(nodeTwo, sbTwo);
        String result = String.valueOf(Integer.parseInt(sbOne.toString()) + Integer.parseInt(sbTwo.toString()));

        Node previous;
        if (result.length() == 0) {
            return null;
        }
        previous = new Node(null, Character.getNumericValue(result.charAt(result.length() - 1)));
        Node head = previous;

        for (int i = result.length() - 2; i >= 0; i--) {
            Node current = new Node(null, Character.getNumericValue(result.charAt(i)));
            previous.next = current;
            previous = current;
        }
        return head;
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
