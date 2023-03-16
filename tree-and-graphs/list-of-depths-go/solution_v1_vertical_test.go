package list_of_depths_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestListOfDeeps_vertical(t *testing.T) {
	node1 := Node{
		Value: 1,
	}

	node2 := Node{
		Value: 2,
	}

	node3 := Node{
		Value: 3,
	}

	node4 := Node{
		Value: 4,
	}

	node5 := Node{
		Value: 5,
	}

	node2.Adjacents = []Node{
		node4,
	}
	node3.Adjacents = []Node{
		node5,
	}
	node1.Adjacents = []Node{
		node2,
		node3,
	}

	expected := map[int][]int{
		0: {1, 2, 4},
		1: {1, 3, 5},
	}
	res := listOfVerticalDeeps(&node1)
	for i, current := range res {
		arrayExpected := extractLinkedList(&current)
		assert.Equal(t, expected[i], arrayExpected)
	}
}

func extractLinkedList(list *NodeLinkedList) (res []int) {
	for list != nil {
		res = append(res, list.Value)
		list = list.Next
	}

	return res
}
