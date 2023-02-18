package palindrome

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestIsPalindromeV2_whenShouldBeTrue(t *testing.T) {
	nodeFour := Node{
		Next:   nil,
		Letter: 'n',
	}
	nodeThree := Node{
		Next:   &nodeFour,
		Letter: 'o',
	}
	nodeTwo := Node{
		Next:   &nodeThree,
		Letter: 'o',
	}
	nodeOne := &Node{
		Next:   &nodeTwo,
		Letter: 'n',
	}

	assert.True(t, isPalindromeV2(nodeOne))
}

func TestIsPalindromeV2_whenShouldBeTrue2(t *testing.T) {
	nodeThree := Node{
		Next:   nil,
		Letter: 'e',
	}
	nodeTwo := Node{
		Next:   &nodeThree,
		Letter: 'v',
	}
	nodeOne := &Node{
		Next:   &nodeTwo,
		Letter: 'e',
	}

	assert.True(t, isPalindromeV2(nodeOne))
}

func TestIsPalindromeV2_whenShouldBeFalse(t *testing.T) {
	nodeFour := Node{
		Next:   nil,
		Letter: 'm',
	}
	nodeThree := Node{
		Next:   &nodeFour,
		Letter: 'o',
	}
	nodeTwo := Node{
		Next:   &nodeThree,
		Letter: 'o',
	}
	nodeOne := &Node{
		Next:   &nodeTwo,
		Letter: 'n',
	}

	assert.False(t, isPalindromeV2(nodeOne))
}
