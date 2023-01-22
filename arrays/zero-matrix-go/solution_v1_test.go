package zero_matrix_go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestZeroMatrix_1(t *testing.T) {
	res := ZeroMatrix([][]int{
		{1, 2, 3},
		{4, 0, 6},
		{7, 8, 9},
	})

	expected := [][]int{
		{1, 0, 3},
		{0, 0, 0},
		{7, 0, 9},
	}

	for line := 0; line < len(res); line++ {
		for column := 0; column < len(res); column++ {
			assert.Equal(t, res[line][column], expected[line][column])
		}
	}
}

func TestZeroMatrix_2(t *testing.T) {
	res := ZeroMatrix([][]int{
		{0, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	})

	expected := [][]int{
		{0, 0, 0},
		{0, 5, 6},
		{0, 8, 9},
	}

	for line := 0; line < len(res); line++ {
		for column := 0; column < len(res); column++ {
			assert.Equal(t, res[line][column], expected[line][column])
		}
	}
}

func TestZeroMatrix_3(t *testing.T) {
	res := ZeroMatrix([][]int{
		{0, 2, 3},
		{4, 5, 6},
		{7, 8, 0},
	})

	expected := [][]int{
		{0, 0, 0},
		{0, 5, 0},
		{0, 0, 0},
	}

	for line := 0; line < len(res); line++ {
		for column := 0; column < len(res); column++ {
			assert.Equal(t, res[line][column], expected[line][column])
		}
	}
}

func TestZeroMatrix_4(t *testing.T) {
	res := ZeroMatrix([][]int{
		{0, 2, 3},
		{4, 0, 6},
		{7, 8, 9},
	})

	expected := [][]int{
		{0, 0, 0},
		{0, 0, 0},
		{0, 0, 9},
	}

	for line := 0; line < len(res); line++ {
		for column := 0; column < len(res); column++ {
			assert.Equal(t, res[line][column], expected[line][column])
		}
	}
}
