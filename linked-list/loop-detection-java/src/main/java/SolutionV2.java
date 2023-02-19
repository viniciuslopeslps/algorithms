public class SolutionV2 {
    public Character loopDetectionV2(Node node) {
        Node fast = node.next.next;
        Node slow = node;

        while (true){
            if (fast.next == null || fast.next.next == null || slow == null){
                return  null;
            }

            if (fast == slow){
                return fast.next.data;
            }

            fast = fast.next.next;
            slow = slow.next;
        }
    }
}
