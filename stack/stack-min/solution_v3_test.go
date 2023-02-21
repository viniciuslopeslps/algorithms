package stack_min

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPushAndPop_solutionV3(t *testing.T) {
	stack := StackMinV3{}
	stack.Push(1)
	stack.Push(2)
	stack.Push(3)

	assert.Equal(t, stack.values, []int{1, 2, 3})

	assert.Equal(t, *stack.Pop(), 3)
	assert.Equal(t, *stack.Pop(), 2)
	assert.Equal(t, *stack.Pop(), 1)
}

func TestMin_solutionv3(t *testing.T) {
	stack := StackMinV3{}
	stack.Push(1)
	stack.Push(2)
	stack.Push(3)

	assert.Equal(t, stack.Min(), 1)
}

func TestMin_solutionv3_2(t *testing.T) {
	stack := StackMinV3{}
	stack.Push(1)
	stack.Push(0)
	stack.Push(3)
	stack.Push(3)

	assert.Equal(t, stack.Min(), 0)
}

func TestMin_solutionV3_3(t *testing.T) {
	stack := StackMinV3{}
	stack.Push(1)
	stack.Push(0)

	assert.Equal(t, *stack.Pop(), 0)
	assert.Equal(t, stack.Min(), 1)
}
