package list_of_depths_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestListOfDeeps(t *testing.T) {
	solutionV1 := SolutionV1{}

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
		0: {1},
		1: {2, 3},
		2: {4, 5},
	}

	deeps := solutionV1.listOfDeeps(&node1)
	for i, current := range deeps {
		res := extractLinkedList(&current)
		assert.Equal(t, res, expected[i])
	}

}
