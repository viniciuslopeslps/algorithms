package list_of_depths_go

type SolutionV1 struct{}

func (s *SolutionV1) listOfDeeps(node *Node) []NodeLinkedList {
	hashLevels := make(map[int]*NodeLinkedList)

	s.dsp(node, hashLevels, 0)

	var res []NodeLinkedList
	for _, value := range hashLevels {
		res = append(res, *value)
	}

	return res
}

func (s *SolutionV1) dsp(node *Node, hashLevels map[int]*NodeLinkedList, level int) {
	if node == nil {
		return
	}

	current := hashLevels[level]
	if current == nil {
		hashLevels[level] = &NodeLinkedList{
			Value: node.Value,
		}
	} else {
		for current.Next != nil {
			current = hashLevels[level].Next
		}

		current.Next = &NodeLinkedList{
			Value: node.Value,
		}
	}

	level += 1
	for _, adjacent := range node.Adjacents {
		s.dsp(&adjacent, hashLevels, level)
	}
}
