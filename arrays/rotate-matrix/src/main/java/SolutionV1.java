
public class SolutionV1 {

    public int[][] rotateMatrix(int[][] matrix) {
        int [][] copy = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++)
            copy[i] = matrix[i].clone();

        int newColumn = matrix.length - 1;

        for (int line = 0; line < matrix.length; line++) {
            int newLine = 0;
            for (int column = 0; column < matrix.length; column++) {
                int value = matrix[line][column];
                copy[newLine][newColumn] = value;
                newLine++;
            }
            newColumn--;
        }

        return copy;
    }
}


/**
 * 1    2   3   4
 * 5    6   7   8
 * 9    10  11  12
 * 13   14  15  16

 * 13     9   5   1
 * 14     10  6   2
 * 15     11  7   3
 * 16     12  8   4

 * 00   01  02  03
 * 10   11  12  12
 * 20   21  22  23
 * 30   31  32  33

 * 30   20  10  00
 * 31   21  11  01
 * 32   22  12  02
 * 33   23  13  03
 */
