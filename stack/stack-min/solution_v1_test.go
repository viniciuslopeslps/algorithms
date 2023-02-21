package stack_min

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPushAndPop_solutionV1(t *testing.T) {
	stack := StackMinV1{}
	stack.Push(1)
	stack.Push(2)
	stack.Push(3)

	assert.Equal(t, stack.values, []int{1, 2, 3})

	assert.Equal(t, *stack.Pop(), 3)
	assert.Equal(t, *stack.Pop(), 2)
	assert.Equal(t, *stack.Pop(), 1)
}

func TestMin_solutionV1(t *testing.T) {
	stack := StackMinV1{}
	stack.Push(1)
	stack.Push(2)
	stack.Push(3)

	assert.Equal(t, stack.Min(), 1)
}
