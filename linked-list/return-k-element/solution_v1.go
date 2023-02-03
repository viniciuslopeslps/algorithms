package return_k_element

type Node struct {
	Next  *Node
	value int
}

func ReturnKElement(node *Node) int {
	var total int

	for {
		if node == nil {
			break
		}

		total += 1
		node = node.Next
	}

	return total
}
