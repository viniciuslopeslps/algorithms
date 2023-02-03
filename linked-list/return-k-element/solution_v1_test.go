package return_k_element

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestReturnKElement_1(t *testing.T) {
	nodeFour := Node{
		Next:  nil,
		value: 4,
	}
	nodeThree := Node{
		Next:  &nodeFour,
		value: 3,
	}
	nodeTwo := Node{
		Next:  &nodeThree,
		value: 2,
	}
	nodeOne := Node{
		Next:  &nodeTwo,
		value: 1,
	}
	assert.Equal(t, ReturnKElement(&nodeOne), 4)
}

func TestReturnKElement_2(t *testing.T) {
	nodeOne := Node{
		Next:  nil,
		value: 1,
	}
	assert.Equal(t, ReturnKElement(&nodeOne), 1)
}
