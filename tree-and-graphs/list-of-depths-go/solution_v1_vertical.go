package list_of_depths_go

func listOfVerticalDeeps(node *Node) []NodeLinkedList {
	root := &NodeLinkedList{
		Value: node.Value,
	}

	var deeps []NodeLinkedList
	for _, adjacent := range node.Adjacents {
		dsp(&adjacent, root)
		deeps = append(deeps, *root)
	}

	return deeps
}

func dsp(node *Node, linkedList *NodeLinkedList) {
	if node == nil {
		return
	}

	newLinkedListNode := NodeLinkedList{Value: node.Value}
	linkedList.Next = &newLinkedListNode

	for _, adjacent := range node.Adjacents {
		dsp(&adjacent, &newLinkedListNode)
	}
}
