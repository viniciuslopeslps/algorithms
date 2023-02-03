package soluction_v1

func isPalindromePermutation(word string) bool {
	var counter [128]int

	for _, letter := range word {
		if string(letter) != " " {
			counter[letter] = counter[letter] + 1
		}
	}

	uniqueChars := 0
	for _, value := range counter {
		if value == 1 {
			uniqueChars += 1
		}

		if uniqueChars > 1 {
			return false
		}
	}

	return true
}
