public class SolutionV1 {

     void deleteMiddle(Node node, String value){
         while (node.getNext() != null){
             if (node.getNext().getData().equals(value)){
                 node.setNext(node.getNext().getNext());
                 return;
             }
             node = node.getNext();
         }
     }
}
