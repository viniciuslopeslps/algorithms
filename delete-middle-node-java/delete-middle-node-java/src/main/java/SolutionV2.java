public class SolutionV2 {

    void deleteMiddle(Node node, String value){
        if (node.getNext() == null){
            return;
        }

        if (node.getNext().getData().equals(value)){
            node.setNext(node.getNext().getNext());
        }

        deleteMiddle(node.getNext(),value);
    }
}
