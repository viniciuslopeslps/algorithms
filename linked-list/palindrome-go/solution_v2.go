package palindrome

func isPalindromeV2(node *Node) bool {
	fast := node
	slow := node
	var stack []rune

	for fast != nil && fast.Next != nil {
		stack = append(stack, slow.Letter)
		slow = slow.Next
		fast = fast.Next.Next
	}
	if fast != nil {
		slow = slow.Next
	}
	for slow != nil {
		value := stack[len(stack)-1]
		stack = stack[:len(stack)-1]

		if value != slow.Letter {
			return false
		}
		slow = slow.Next
	}

	return true
}
