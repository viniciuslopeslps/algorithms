public class SolutionV1 {

    public boolean oneWay(String wordOne, String wordTwo) {
        String bigger, shorter;

        if (wordOne.length() >= wordTwo.length()) {
            bigger = wordOne;
            shorter = wordTwo;
        } else {
            bigger = wordTwo;
            shorter = wordOne;
        }


        int idxBigger = 0, idxShorter = 0;
        boolean oneDiff = false;
        while (idxBigger < bigger.length() && idxShorter < shorter.length()) {
            if (bigger.charAt(idxBigger) != shorter.charAt(idxShorter)) {
                if (oneDiff) {
                    return false;
                }
                oneDiff = true;

                if (bigger.length() == shorter.length()) {
                    idxShorter++; // on replace move shorter
                }
            } else {
                idxShorter++;
            }
            idxBigger++; // always move bigger
        }
        return true;
    }
}

