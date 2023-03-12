package route_between_nodes_go

func SolutionV1(a, b Node) bool {
	var nodesToCheck []Node
	a.Visited = true
	nodesToCheck = append(nodesToCheck, a)

	for len(nodesToCheck) > 0 {
		first := nodesToCheck[0]
		for _, adjacent := range first.Adjacents {
			if adjacent.Visited {
				continue
			}

			if adjacent.Value == b.Value {
				return true
			}

			adjacent.Visited = true
			nodesToCheck = append(nodesToCheck, adjacent)
		}

		nodesToCheck = nodesToCheck[1:]
	}
	return false
}
