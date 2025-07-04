class DFT {
	int[][] adj;
	boolean[] visited;
	int[] stack;
	int tos;

	public DFT(int v) {
		adj = new int[v][v];
		visited = new boolean[v];
		stack = new int[v];
		tos = -1;
	}

	void addEdge(int src, int dest) {
		adj[src][dest] = 1;
		adj[dest][src] = 1;
	}

	void performDFT(int x) {
		push(x);
		System.out.println("Depth First Traversal: ");
		while (tos != -1) {
			int curr = pop();
			if (!visited[curr]) {
				visited[curr] = true;
				System.out.print(curr + " ");
				for (int i = adj.length - 1; i >= 0; i--) {
					if (adj[curr][i] == 1 && !visited[i]) {
						push(i);
					}
				} // end for
			} // end if
		}
	} // end of DFT

	void push(int node) {
		tos++;
		stack[tos] = node;
	}

	int pop() {
		int tmp = stack[tos];
		tos--;
		return tmp;
	}

	public static void main(String[] args) {
		DFT g = new DFT(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.performDFT(0);
	}
}