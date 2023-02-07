package return_k_element

func ReturnKElementV2(node *Node, k int) int {
	return helper(node, k, 0)
}

func helper(node *Node, k, counter int) int {
	if node == nil {
		return -1
	}

	counter += 1
	if counter == k {
		return node.value
	}

	return helper(node.Next, k, counter)
}
