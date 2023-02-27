import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SetOfPlatesTest {

    @Test
    public void pushTest() {
        SetOfPlates setOfPlates = new SetOfPlates();
        setOfPlates.push(1);
        setOfPlates.push(2);
        setOfPlates.push(3);
        setOfPlates.push(4);
        setOfPlates.push(5);
        setOfPlates.push(6);
        setOfPlates.push(7);
        setOfPlates.push(8);
        setOfPlates.push(9);
        setOfPlates.push(10);

        var expected = new int[]{10,9,8,7,6,5,4,3,2,1};
        int i = 0;
        while (true){
            Integer popped = setOfPlates.pop();
            if (popped == null){
                break;
            }
            int currentExpected = expected[i++];
            Assertions.assertEquals(currentExpected, popped);
         }
    }
}
