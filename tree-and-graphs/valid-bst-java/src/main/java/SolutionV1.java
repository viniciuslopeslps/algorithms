import java.util.ArrayList;
import java.util.List;

public class SolutionV1 {

    public boolean validBst(Node root) {
        var numbers = new ArrayList<Integer>();
        transverseBst(root, numbers);

        for (var i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) > numbers.get(i)) {
                return false;
            }
        }
        return true;
    }

    void transverseBst(Node node, List<Integer> numbers) {
        if (node == null) {
            return;
        }

        transverseBst(node.left, numbers);
        numbers.add(node.value);
        transverseBst(node.right, numbers);
    }
}
