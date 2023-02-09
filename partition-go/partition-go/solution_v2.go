package partition_go

func PartitionV2(node *Node, data int) *Node {
	head := node
	tail := node

	for node != nil {
		next := node.Next
		if node.Data < data {
			// insert at head
			node.Next = head
			head = node
		} else {
			// insert at tail
			tail.Next = node
			tail = node
		}
		node = next
	}

	tail.Next = nil
	return head
}
