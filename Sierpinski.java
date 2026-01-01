/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvas.
	public static void sierpinski (int n) {
		// Coordinates of the initial large triangle
		double x1 = 0.0, y1 = 0.0; // Bottom-left corner
		double x2 = 1.0, y2 = 0.0; // Bottom-right corner
		double x3 = 0.5, y3 = Math.sqrt(3) / 2.0; // Top corner
		
		// Call the recursive drawing function
		sierpinski(n, x1, x2, x3, y1, y2, y3);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
			                         double y1, double y2, double y3) {
		// Base case: if depth is 0, draw the triangle
		if (n == 0) {
			StdDraw.line(x1, y1, x2, y2); // Bottom edge
			StdDraw.line(x2, y2, x3, y3); // Right edge
			StdDraw.line(x3, y3, x1, y1); // Left edge
			return;
		}

		// Midpoints of the edges
		double mx1 = (x1 + x2) / 2.0;
		double my1 = (y1 + y2) / 2.0;
		double mx2 = (x2 + x3) / 2.0;
		double my2 = (y2 + y3) / 2.0;
		double mx3 = (x3 + x1) / 2.0;
		double my3 = (y3 + y1) / 2.0;

		// Recursive calls for the three smaller triangles
		sierpinski(n - 1, x1, mx1, mx3, y1, my1, my3); // Bottom-left triangle
		sierpinski(n - 1, mx1, x2, mx2, my1, y2, my2); // Bottom-right triangle
		sierpinski(n - 1, mx3, mx2, x3, my3, my2, y3); // Top triangle
	}
}