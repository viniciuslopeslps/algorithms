package string_compression

import (
	"bytes"
	"fmt"
)

func StringCompression(word string) string {
	var buff bytes.Buffer

	equals := 1
	var current uint8
	for i := 0; i < len(word)-1; i++ {
		current = word[i]
		next := word[i+1]
		if current == next {
			equals += 1
		} else {
			buff.WriteString(fmt.Sprintf("%v%v", string(current), equals))
			equals = 1
		}
	}

	if equals > 1 {
		buff.WriteString(fmt.Sprintf("%v%v", string(current), equals))
	}

	compressed := buff.String()
	if len(word) < len(compressed) {
		return word
	}

	return compressed
}
