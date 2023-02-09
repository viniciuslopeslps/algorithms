package partition_go

type Node struct {
	Next *Node
	Data int
}

func PartitionV1(node *Node, data int) *Node {
	var partA *Node
	var partB *Node
	for node != nil {
		if node.Data < data {
			partA = addInTail(partA, node)
		} else {
			partB = addInTail(partB, node)
		}
		node = node.Next
	}

	merged := merge(partA, partB)
	return merged
}

func merge(partA *Node, partB *Node) *Node {
	head := partA
	for {
		if partA.Next == nil {
			partA.Next = partB
			break
		}
		partA = partA.Next
	}

	return head
}

func addInTail(node *Node, current *Node) *Node {
	if node == nil {
		node = &Node{
			Next: nil,
			Data: current.Data,
		}
		return node
	}

	head := node
	for {
		if node.Next == nil {
			node.Next = &Node{
				Next: nil,
				Data: current.Data,
			}
			break
		}
		node = node.Next
	}

	return head
}
