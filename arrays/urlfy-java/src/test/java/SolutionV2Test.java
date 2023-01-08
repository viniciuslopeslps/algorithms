import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV2Test {

    @Test
    public void TestSolutionV1Urlfy(){
        SolutionV2 solutionV2 = new SolutionV2();

        String res = solutionV2.urlfyString("Mr John Smith    ".toCharArray(), 13);
        Assertions.assertEquals(res, "Mr%20John%20Smith");
    }
}
