import java.util.HashSet;
import java.util.Set;

public class SolutionV1 {

    public Character loopDetection(Node node) {
        Set<Character> uniques = new HashSet<>();

        return helper(node, uniques);
    }

    private Character helper(Node node, Set<Character> uniques) {
        if (node.next == null){
            return null;
        }

        if (uniques.contains(node.data)) {
            return node.data;
        }

        uniques.add(node.data);
        return helper(node.next, uniques);
    }
}
