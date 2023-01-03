package check_permutations_go

type SolutionV2 struct{}

func NewSolutionV2() *SolutionV2 {
	return &SolutionV2{}
}

func (s *SolutionV2) checkPermutation(wordOne, wordTwo string) bool {
	if len(wordOne) != len(wordTwo) {
		return false
	}

	lettersCounterOne := s.getLetterCounterMap(wordOne)
	lettersCounterTwo := s.getLetterCounterMap(wordTwo)

	for key, value := range lettersCounterOne {
		if lettersCounterTwo[key] != value {
			return false
		}
	}

	return true
}

func (*SolutionV2) getLetterCounterMap(wordOne string) [128]int {
	lettersCounter := [128]int{}
	for _, letter := range wordOne {
		lettersCounter[letter] = lettersCounter[letter] + 1
	}

	return lettersCounter
}
