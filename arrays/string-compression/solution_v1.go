package string_compression

import (
	"bytes"
	"fmt"
)

func StringCompression(word string) string {
	var compression [128]int

	for _, letter := range word {
		compression[letter] = compression[letter] + 1
	}

	var buff bytes.Buffer
	for _, letter := range word {
		buff.WriteString(fmt.Sprintf("%v %v", string(letter), compression[letter]))
	}
	return buff.String()
}
