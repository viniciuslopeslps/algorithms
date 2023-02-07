package return_k_element

type Node struct {
	Next  *Node
	value int
}

func ReturnKElementV1(node *Node, k int) int {
	total := 1

	for {
		if node == nil {
			return -1
		}

		if total == k {
			return node.value
		}

		total += 1
		node = node.Next
	}

	return -1
}
