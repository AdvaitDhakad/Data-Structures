import java.util.Scanner;

class AdjMat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input vertices
		System.out.print("Enter the amount of vertices: ");
		int v = sc.nextInt();
		
		int[][] mat = new int[v][v];
		
		System.out.print("Enter the number of edges: ");
		int edges = sc.nextInt();

		for (int i = 1; i <= edges; i++) {
			System.out.print("Enter the Source: ");
			int source = sc.nextInt();
			System.out.print("Enter the Destination: ");
			int dest = sc.nextInt();
			
			mat[source][dest] = 1;
			mat[dest][source] = 1;
		}
		// display
		System.out.println("The Adjacency Matrix: ");
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}       
	}
}