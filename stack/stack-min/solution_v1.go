package stack_min

type StackMinV1 struct {
	Stack
}

func (s *StackMinV1) Min() int {
	var min int
	first := true
	for _, value := range s.values {
		if first {
			min = value
			first = false
		} else {
			if value < min {
				min = value
			}
		}
	}

	return min
}
