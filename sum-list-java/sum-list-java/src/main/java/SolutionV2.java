public class SolutionV2 {

    Node sumList(Node nodeOne, Node nodeTwo) {
        int carried = 0;
        int total = 0;

        Node previous = null;
        Node head = null;
        for (; nodeOne != null; ) {
            total = (nodeOne.data + nodeTwo.data) + carried;
            Node current = new Node(null, total % 10);

            if (total > 10){
                carried = 1;
            }else {
                carried = 0;
            }
             if (previous == null){
                previous = current;
                 head = previous;
            }else {
                previous.next = current;
                previous = current;
            }

            nodeOne = nodeOne.next;
            nodeTwo = nodeTwo.next;
        }

        return head;
    }


}