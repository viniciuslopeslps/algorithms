package string_compression

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestStringCompression(t *testing.T) {
	assert.Equal(t, "a2b1c5a3", StringCompression("aabcccccaaa"))
}
