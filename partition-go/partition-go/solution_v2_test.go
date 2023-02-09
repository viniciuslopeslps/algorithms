package partition_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPartitionV2(t *testing.T) {
	nodeSeven := Node{
		Next: nil,
		Data: 1,
	}
	nodeSix := Node{
		Next: &nodeSeven,
		Data: 2,
	}
	nodeFive := Node{
		Next: &nodeSix,
		Data: 10,
	}
	nodeFour := Node{
		Next: &nodeFive,
		Data: 5,
	}
	nodeThree := Node{
		Next: &nodeFour,
		Data: 8,
	}
	nodeTwo := Node{
		Next: &nodeThree,
		Data: 5,
	}
	nodeOne := Node{
		Next: &nodeTwo,
		Data: 3,
	}

	res := PartitionV2(&nodeOne, 4)
	var expected []int
	for res != nil {
		expected = append(expected, res.Data)
		res = res.Next
	}

	assert.Equal(t, expected, []int{1, 2, 3, 5, 8, 5, 10})

}
