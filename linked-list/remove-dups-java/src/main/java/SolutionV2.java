import java.util.HashSet;

public class SolutionV2 {

    void removeDups(Node head) {
        while (head != null) {
            Node runner = head.getNext();
            Node previous = head;

            while (runner != null) {
                if (head.getData() == runner.getData()) {
                    if (runner.getNext() == null) {
                        previous.setNext(null);
                    } else {
                        runner.setNext(runner.getNext().getNext());
                    }
                }

                previous = runner;
                runner = runner.getNext();
            }
            head = head.getNext();
        }
    }
}
