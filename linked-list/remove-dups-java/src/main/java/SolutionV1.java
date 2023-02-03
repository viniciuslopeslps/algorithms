import java.util.HashSet;

public class SolutionV1 {

    void removeDups(Node head) {
        HashSet<Integer> set = new HashSet<>();

        Node previous = null;

        while (head != null) {
            if (set.contains(head.getData())) {
                previous.setNext(head.getNext());
            } else {
                previous = head;
                set.add(head.getData());
            }
            head = head.getNext();
        }
    }
}