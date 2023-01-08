import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    @Test
    public void TestSolutionV1Urlfy(){
        SolutionV1 solutionV1 = new SolutionV1();

        String res = solutionV1.urlfyString("Mr John Smith    ".toCharArray(), 13);
        Assertions.assertEquals(res, "Mr%20John%20Smith");
    }
}
