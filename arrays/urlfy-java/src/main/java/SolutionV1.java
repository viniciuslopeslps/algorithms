import java.util.Arrays;

public class SolutionV1 {


    String urlfyString(char[] letters, int trueLength) {
        boolean isEndOfWord = true;
        int spaces = 0;


        for (int i = letters.length - 1; i >= 0; i--) {
            char letter = letters[i];

            if (isEndOfWord) {
                if (Character.isSpaceChar(letter)) {
                    spaces++;
                } else {
                    isEndOfWord = false;
                }
            }
        }


        for (int i = trueLength - 1; i >= 0; i--) {
            char letter = letters[i];

            if (Character.isSpaceChar(letter)) {
                letters[i + (spaces - 2)] = "%".charAt(0);
                letters[i + (spaces - 1)] = "2".charAt(0);
                letters[i + spaces] = "0".charAt(0);

                spaces = spaces - 2;
            } else {
                letters[i + spaces] = letter;
            }
        }

        return new String(letters);
    }
}
