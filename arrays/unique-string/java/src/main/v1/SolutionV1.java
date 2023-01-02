package main.v1;

public class SolutionV1 {
    private char[] uniques;

      public boolean uniqueStrings(String word) {
        this.uniques = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (checkAlreadyInserted(letter)) {
                return false;
            }
            this.uniques[i] = letter;
        }

        return true;
    }

    boolean checkAlreadyInserted(char letter) {
        for (char unique : this.uniques) {
            if (unique == letter) {
                return true;
            }
        }

        return false;
    }
}
