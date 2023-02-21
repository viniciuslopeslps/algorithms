package stack_min

type StackMinV2 struct {
	Stack
}

func (s *StackMinV2) Min() int {
	min := -1
	if len(s.values) > 0 {
		min = s.values[0]
	}

	return s.helper(min)
}
func (s *StackMinV2) helper(min int) int {
	popped := s.Pop()
	if popped == nil {
		return min
	}

	if *popped < min {
		min = *popped
	}

	return s.helper(min)
}
