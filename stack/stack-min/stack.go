package stack_min

type Stack struct {
	values []int
}

func (s *Stack) Push(value int) {
	s.values = append(s.values, value)
}

func (s *Stack) Pop() *int {
	size := len(s.values)
	if size == 0 {
		return nil
	}

	value := s.values[size-1]
	s.values = s.values[:size-1]
	return &value
}
