package main;

public class SolutionV1 {
    private char[] uniqueLetters;

      public boolean uniqueStrings(String word) {
        this.uniqueLetters = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            var letter = word.charAt(i);

            if (checkAlreadyInserted(letter)) {
                return false;
            }
            this.uniqueLetters[i] = letter;
        }

        return true;
    }

    boolean checkAlreadyInserted(char letter) {
        for (char unique : this.uniqueLetters) {
            if (unique == letter) {
                return true;
            }
        }

        return false;
    }
}
