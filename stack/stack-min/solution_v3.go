package stack_min

type StackMinV3 struct {
	Stack
	mins []int
}

func (s *StackMinV3) Push(value int) {
	if len(s.values) == 0 {
		s.mins = append(s.mins, value)
	}
	if value < s.Min() {
		s.mins = append(s.mins, value)
	}

	s.values = append(s.values, value)
}

func (s *StackMinV3) Min() int {
	return s.mins[len(s.mins)-1]
}

func (s *StackMinV3) Pop() *int {
	size := len(s.values)
	if size == 0 {
		return nil
	}

	value := s.values[size-1]
	s.values = s.values[:size-1]
	if value == s.Min() {
		s.mins = s.mins[:len(s.mins)-1]
	}
	return &value
}
