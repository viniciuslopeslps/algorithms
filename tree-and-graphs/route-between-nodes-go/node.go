package route_between_nodes_go

type Node struct {
	Value     int
	Visited   bool
	Adjacents []Node
}
