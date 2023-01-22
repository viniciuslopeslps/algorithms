package zero_matrix_go

func ZeroMatrix(matrix [][]int) [][]int {
	var lines []int
	var columns []int

	for line := 0; line < len(matrix); line++ {
		for column := 0; column < len(matrix); column++ {
			value := matrix[line][column]
			if value == 0 {
				lines = append(lines, line)
				columns = append(columns, column)
			}
		}
	}

	for _, line := range lines {
		for column := 0; column < len(matrix); column++ {
			matrix[line][column] = 0
		}
	}

	for _, column := range columns {
		for line := 0; line < len(matrix); line++ {
			matrix[line][column] = 0
		}
	}

	return matrix
}
