package palindrome

type Node struct {
	Next   *Node
	Letter rune
}

func isPalindrome(node *Node) bool {
	fast := node.Next
	slow := node
	var leftMiddle []rune
	var middleRight []rune

	for slow != nil {
		if fast.Next == nil {
			middleRight = append(middleRight, slow.Letter)
		} else {
			leftMiddle = append(leftMiddle, slow.Letter)
			fast = fast.Next
		}
		slow = slow.Next
	}

	limitMiddle := 0
	if len(middleRight) > len(leftMiddle) {
		limitMiddle = 1
	}

	i := 0
	k := len(middleRight) - 1
	for {
		if i > len(leftMiddle) || k < limitMiddle {
			return true
		}

		if leftMiddle[i] != middleRight[k] {
			return false
		}

		i += 1
		k -= 1
	}

}
