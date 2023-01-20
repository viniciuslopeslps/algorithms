import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {

    @Test
    public void SolutionV1Test() {

        SolutionV1 solutionV1 = new SolutionV1();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] response = solutionV1.rotateMatrix(matrix);
        int[][] expected = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                Assertions.assertEquals(expected[line][column], response[line][column]);
            }
        }

    }
}
