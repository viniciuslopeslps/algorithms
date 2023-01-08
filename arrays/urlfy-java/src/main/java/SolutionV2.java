public class SolutionV2 {
    String urlfyString(char[] letters, int trueLength) {
        int spaceCount = 0, index, i = 0;

        for (i = 0; i < trueLength; i++) {
            if (letters[i] == ' '){
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        if (trueLength < letters.length) {
            letters[trueLength] = '\n';
        }
        for (i = trueLength - 1; i >= 0; i--) {
            if (letters[i] == ' ') {
                letters[index - 1] = '0';
                letters[index - 2] = '2';
                letters[index - 3] = '%';
                index = index - 3;
            } else {
                letters[index - 1] = letters[i];
                index--;
            }
        }

        return new String(letters);
    }
}
