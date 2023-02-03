public class Node {
    private Node next = null;
    private int data;

    public Node(Node next, int data){
        this.next = next;
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
