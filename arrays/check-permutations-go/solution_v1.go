package check_permutations_go

type SolutionV1 struct{}

func NewSolutionV1() *SolutionV1 {
	return &SolutionV1{}
}

func (s *SolutionV1) checkPermutation(wordOne, wordTwo string) bool {
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

func (*SolutionV1) getLetterCounterMap(wordOne string) map[int32]uint {
	lettersCounter := make(map[int32]uint)
	for _, letter := range wordOne {
		lettersCounter[letter] = lettersCounter[letter] + 1
	}

	return lettersCounter
}
