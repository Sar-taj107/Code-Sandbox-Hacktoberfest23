public class MatrixTraversal {
	// Define the dimensions of the matrix
	private static final int N = 3;
	private static final int M = 3;

	// Recursive function to traverse the matrix
	private static void traverse(int[][] arr, int i, int j) {
		// If the current position is the bottom-right corner of
		// the matrix
		if (i == N - 1 && j == M - 1) {
			// Print the value at that position
			System.out.println(arr[i][j]);
			// End the recursion
			return;
		}

		// Print the value at the current position
		System.out.print(arr[i][j] + ", ");

		// If the end of the current row has not been reached
		if (j < M - 1) {
			// Move right
			traverse(arr, i, j + 1);
		}
		// If the end of the current column has been reached
		else if (i < N - 1) {
			// Move down to the next row
			traverse(arr, i + 1, 0);
		}
	}

	public static void main(String[] args) {
		// Define the matrix
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Start the traversal from the top-left corner of the
		// matrix
		traverse(arr, 0, 0);
	}
}
