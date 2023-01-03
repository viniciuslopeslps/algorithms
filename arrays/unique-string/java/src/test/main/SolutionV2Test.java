package test.main;

 import main.SolutionV2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV2Test {

    private final SolutionV2 solutionV2 = new SolutionV2();

    @Test
    void TestUniqueString_whenNotUniqueString() {
        Assertions.assertFalse(solutionV2.uniqueStrings("hello"));
    }

    @Test
    void TestUniqueString_whenUniqueString() {
        Assertions.assertTrue(solutionV2.uniqueStrings("helo"));
    }
}
