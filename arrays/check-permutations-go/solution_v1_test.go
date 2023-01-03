package check_permutations_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPermutationSolutionV1_whenPermutation(t *testing.T) {
	solutionV1 := NewSolutionV1()
	assert.True(t, solutionV1.checkPermutation("aaabbbccc", "abcabcabc"))
}

func TestPermutationSolutionV1_whenNotPermutation(t *testing.T) {
	solutionV1 := NewSolutionV1()
	assert.False(t, solutionV1.checkPermutation("aaabbbccd", "abcabcabc"))
}
