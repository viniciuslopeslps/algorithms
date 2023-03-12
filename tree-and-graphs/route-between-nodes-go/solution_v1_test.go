package route_between_nodes_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestSolutionV1(t *testing.T) {
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
	node3.Adjacents = []Node{
		node5,
	}

	node1.Adjacents = []Node{
		node2,
		node3,
	}

	assert.True(t, SolutionV1(node1, node2))
	assert.True(t, SolutionV1(node1, node5))
	assert.False(t, SolutionV1(node1, node4))
}
