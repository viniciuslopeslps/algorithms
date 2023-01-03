package main;

public class SolutionV2 {
    /**
     * a ideia é utilizar o tamanho da tabela ASCII como chave, ou seja, 128 possíveis caracteres.
     * Depois disso, vamos interar sobre as letras da palavra, para a posição dela já está como TRUE então não é único.
     */

    private final boolean[]  uniqueLetters = new boolean[128];

    public boolean uniqueStrings(String word){
        for(int i = 0; i < word.length(); i++){
            char asciiValue = word.charAt(i);

            if (this.uniqueLetters[asciiValue]){
                return false;
            }

            this.uniqueLetters[asciiValue] = true;
        }

        return true;
    }
}
