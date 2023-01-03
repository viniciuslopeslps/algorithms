package check_permutations_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPermutationSolutionV2_whenPermutation(t *testing.T) {
	solutionV1 := NewSolutionV2()
	assert.True(t, solutionV1.checkPermutation("aaabbbccc", "abcabcabc"))
}

func TestPermutationSolutionV2_whenNotPermutation(t *testing.T) {
	solutionV1 := NewSolutionV2()
	assert.False(t, solutionV1.checkPermutation("aaabbbccd", "abcabcabc"))
}
