import java.util.ArrayList;
import java.util.List;

public class SolutionV2 {

    Integer lastNum = null;

    public boolean validBst(Node root) {
        if (root == null){
            return true;
        }

        if (!validBst(root.left)){
            return false;
        }

        if (lastNum !=null && lastNum > root.value){
            return false;
        }

        lastNum = root.value;
        if (!validBst(root.right)){
            return false;
        }

        return true;
    }

}
