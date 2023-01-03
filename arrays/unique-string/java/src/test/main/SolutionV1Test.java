package test.main;


import main.SolutionV1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    private final SolutionV1 solutionV1 = new SolutionV1();

    @Test
    void TestUniqueString_whenNotUniqueString() {
        Assertions.assertFalse(solutionV1.uniqueStrings("hello"));
    }

    @Test
    void TestUniqueString_whenUniqueString() {
        Assertions.assertTrue(solutionV1.uniqueStrings("helo"));
    }
}
