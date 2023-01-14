import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    @Test
    public void OneWayTest(){
        SolutionV1 solutionV1 = new SolutionV1();
        Assertions.assertTrue(solutionV1.oneWay("pale", "ple"));
        Assertions.assertTrue(solutionV1.oneWay("pales", "pale"));
        Assertions.assertTrue(solutionV1.oneWay("pale", "bale"));
        Assertions.assertTrue(solutionV1.oneWay("pale", "ppale"));
        Assertions.assertFalse(solutionV1.oneWay("pale", "bake"));

    }
}
